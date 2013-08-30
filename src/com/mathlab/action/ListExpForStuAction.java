package com.mathlab.action;

import java.util.LinkedList;
import java.util.List;

import com.mathlab.model.Experiment;
import com.mathlab.model.StuAndCourse;
import com.mathlab.service.ExpService;
import com.mathlab.service.StuAndCourseService;
import com.mathlab.service.StuService;
import com.opensymphony.xwork2.ActionSupport;

public class ListExpForStuAction extends ActionSupport {
	private StuService stuService;
	private StuAndCourseService stuAndCourseService;
	private ExpService expService;
	private String stuName;
	private List<Experiment> eList;
	public StuService getStuService() {
		return stuService;
	}
	public void setStuService(StuService stuService) {
		this.stuService = stuService;
	}
	public StuAndCourseService getStuAndCourseService() {
		return stuAndCourseService;
	}
	public void setStuAndCourseService(StuAndCourseService stuAndCourseService) {
		this.stuAndCourseService = stuAndCourseService;
	}
	public ExpService getExpService() {
		return expService;
	}
	public void setExpService(ExpService expService) {
		this.expService = expService;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public List<Experiment> getEList() {
		return eList;
	}
	public void setEList(List<Experiment> list) {
		eList = list;
	}
	@Override
	public String execute() throws Exception {
		System.out.println("session登录名是"+stuName);
		String stuNum = stuService.getStuNumByUsername(stuName);
		List<StuAndCourse> scList = stuAndCourseService.getCourseByUsernum(stuNum); 
		List<Experiment> tempList = new LinkedList<Experiment>();
		for(int j=0;j<scList.size();j++){
			List<Experiment> expList = expService.listExpByCourseId(scList.get(j).getCourseID());
			tempList.addAll(expList);
		}
		eList = tempList;
		return "success";
	}
	
}
