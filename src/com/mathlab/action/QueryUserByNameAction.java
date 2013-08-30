package com.mathlab.action;

import java.util.List;

import com.mathlab.model.Manager;
import com.mathlab.model.Student;
import com.mathlab.model.Teacher;
import com.mathlab.service.ManService;
import com.mathlab.service.StuService;
import com.mathlab.service.TeaService;
import com.opensymphony.xwork2.ActionSupport;

public class QueryUserByNameAction extends ActionSupport {
	private StuService stuService;
	private TeaService teaService;
	private ManService manService;
	private List<Student> stuList;
	private List<Teacher> teaList;
	private List<Manager> manList;
	private String username;
	private String userAuth;
	
	public StuService getStuService() {
		return stuService;
	}
	public void setStuService(StuService stuService) {
		this.stuService = stuService;
	}
	public TeaService getTeaService() {
		return teaService;
	}
	public void setTeaService(TeaService teaService) {
		this.teaService = teaService;
	}
	public ManService getManService() {
		return manService;
	}
	public void setManService(ManService manService) {
		this.manService = manService;
	}
	public List<Student> getStuList() {
		return stuList;
	}
	public void setStuList(List<Student> stuList) {
		this.stuList = stuList;
	}
	public List<Teacher> getTeaList() {
		return teaList;
	}
	public void setTeaList(List<Teacher> teaList) {
		this.teaList = teaList;
	}
	public List<Manager> getManList() {
		return manList;
	}
	public void setManList(List<Manager> manList) {
		this.manList = manList;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserAuth() {
		return userAuth;
	}
	public void setUserAuth(String userAuth) {
		this.userAuth = userAuth;
	}
	@Override
	public String execute() throws Exception {
		System.out.println("查询用户:"+username);
		System.out.println("身份:   "+userAuth);
		if(userAuth.equals("学生")){
				stuList = stuService.queryStuByName(username);
				return "stuQuerySuccess";			
		}if(userAuth.equals("教师")){
			teaList = teaService.queryTeaByName(username);
			return "teaQuerySuccess";
			
		}else{
			if(userAuth.equals("管理员")){
				manList = manService.queryManByName(username);
			 	return "manQuerySuccess";	
			}
		}
		return "userAuthError";
	}
}
