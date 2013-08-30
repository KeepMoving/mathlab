package com.mathlab.action;

import java.util.List;

import com.mathlab.model.Authority;
import com.mathlab.model.Grade;
import com.mathlab.service.AuthService;
import com.mathlab.service.GradeService;
import com.opensymphony.xwork2.ActionSupport;

public class ListGradeAuthAction extends ActionSupport {
    private List<Grade> gList;
    private GradeService gradeService;
    private List<Authority> aList;
    private AuthService authService;
    
	public List<Grade> getGList() {
		return gList;
	}

	public void setGList(List<Grade> list) {
		gList = list;
	}

	public GradeService getGradeService() {
		return gradeService;
	}

	public void setGradeService(GradeService gradeService) {
		this.gradeService = gradeService;
	}

	public List<Authority> getAList() {
		return aList;
	}

	public void setAList(List<Authority> list) {
		aList = list;
	}

	public AuthService getAuthService() {
		return authService;
	}

	public void setAuthService(AuthService authService) {
		this.authService = authService;
	}

	@Override
	public String execute() throws Exception {
		System.out.print("=======FindallActon================");
		gList = gradeService.listGrade();
		aList = authService.listAuth();
		System.out.print(gList.size());
		System.out.print(aList.size());		
		return "listGradeAuthSuccess";
	}

}
