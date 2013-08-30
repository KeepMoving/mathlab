package com.mathlab.action;

import com.mathlab.model.Course;
import com.mathlab.service.CourseService;
import com.opensymphony.xwork2.ActionSupport;

public class AddCourseAction extends ActionSupport {
	private CourseService courseService;
	private String courseName;
	private String classRoom;
	private String detail;
	private String teacher;
	public CourseService getCourseService() {
		return courseService;
	}
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	@Override
	public String execute() throws Exception {
		Course course = new Course();
		course.setCourseName(courseName);
		course.setClassRoom(classRoom);
		course.setTeacher(teacher);
		course.setDetail(detail);
		
		courseService.addCourse(course);
		return "addCourseSuccess";
	}
	
}
