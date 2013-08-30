package com.mathlab.action;

import com.mathlab.model.Grade;
import com.mathlab.service.GradeService;
import com.opensymphony.xwork2.ActionSupport;

public class AddGradeAction extends ActionSupport {

	private GradeService gradeService;
	private String graName;
	private String school;
	private String detail;

	public GradeService getGradeService() {
		return gradeService;
	}
	public void setGradeService(GradeService gradeService) {
		this.gradeService = gradeService;
	}
	public String getGraName() {
		return graName;
	}
	public void setGraName(String graName) {
		this.graName = graName;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	@Override
	public String execute() throws Exception {
		Grade grade = new Grade();
		grade.setGraName(graName);
		grade.setSchool(school);
		grade.setDetail(detail);
	    gradeService.addGrade(grade);
		return "addGradeSuccess";
	}
}
