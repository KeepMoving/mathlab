package com.mathlab.action;

import java.util.List;

import com.mathlab.model.Course;
import com.mathlab.model.Teacher;
import com.mathlab.service.CourseService;
import com.mathlab.service.TeaService;
import com.opensymphony.xwork2.ActionSupport;

public class PreAddExpAction extends ActionSupport {

	private CourseService courseService ;
	private TeaService teaService ;
	private List<Course> cList;
	private List<Teacher> tList;
	public CourseService getCourseService() {
		return courseService;
	}
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}
	public TeaService getTeaService() {
		return teaService;
	}
	public void setTeaService(TeaService teaService) {
		this.teaService = teaService;
	}
	
	public List<Course> getCList() {
		return cList;
	}
	public void setCList(List<Course> list) {
		cList = list;
	}
	public List<Teacher> getTList() {
		return tList;
	}
	public void setTList(List<Teacher> list) {
		tList = list;
	}
	@Override
	public String execute() throws Exception {
		cList = courseService.listCourse();
		tList = teaService.listTea();
		System.out.println(cList.size());
		System.out.println(tList.size());
		return "success";
	}
	
	
}
