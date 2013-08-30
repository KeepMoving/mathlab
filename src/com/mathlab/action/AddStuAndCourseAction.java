package com.mathlab.action;

import com.mathlab.model.StuAndCourse;
import com.mathlab.service.StuAndCourseService;
import com.opensymphony.xwork2.ActionSupport;

public class AddStuAndCourseAction extends ActionSupport {

	private StuAndCourseService stuAndCourseService;
	private String stuNum;
	private int courseID;
	
	public StuAndCourseService getStuAndCourseService() {
		return stuAndCourseService;
	}

	public void setStuAndCourseService(StuAndCourseService stuAndCourseService) {
		this.stuAndCourseService = stuAndCourseService;
	}

	public String getStuNum() {
		return stuNum;
	}

	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}

	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	@Override
	public String execute() throws Exception {
		StuAndCourse stuAndCourse = new StuAndCourse();
		stuAndCourse.setCourseID(courseID);
		stuAndCourse.setStuNum(stuNum);
		System.out.println(courseID);
		System.out.println(stuNum);
		stuAndCourseService.addStuAndCourse(stuAndCourse);
		return "addStuAndCourseActionSuccess";
	}
	
}
