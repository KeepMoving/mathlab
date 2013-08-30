package com.mathlab.action;

import java.util.List;

import com.mathlab.model.Course;
import com.mathlab.model.Student;
import com.mathlab.service.CourseService;
import com.mathlab.service.StuService;
import com.opensymphony.xwork2.ActionSupport;

public class PreAddStuAndCourseAction extends ActionSupport {

	private CourseService courseService;
	private StuService stuService;
	private List<Course> cList;
	private List<Student> sList;
	public CourseService getCourseService() {
		return courseService;
	}
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}
	public StuService getStuService() {
		return stuService;
	}
	public void setStuService(StuService stuService) {
		this.stuService = stuService;
	}
	
	public List<Course> getCList() {
		return cList;
	}
	public void setCList(List<Course> list) {
		cList = list;
	}
	public List<Student> getSList() {
		return sList;
	}
	public void setSList(List<Student> list) {
		sList = list;
	}
	@Override
	public String execute() throws Exception {

		cList = courseService.listCourse();
		sList = stuService.listStu();
		System.out.println(cList.size());
		System.out.println(sList.size());
		System.out.println(cList.get(0).getCourseName());
		System.out.println(sList.get(0).getStuNum());	
		return "preAddStuAndCourseSuccess";
	}
	
	
}
