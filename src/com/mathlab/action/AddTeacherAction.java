package com.mathlab.action;

import com.mathlab.model.Teacher;
import com.mathlab.service.TeaService;
import com.opensymphony.xwork2.ActionSupport;

public class AddTeacherAction extends ActionSupport {

	private TeaService teaService;
	private String teaName;
	private String teaPwd;
	private String authority;
	
	
	
	public TeaService getTeaService() {
		return teaService;
	}



	public void setTeaService(TeaService teaService) {
		this.teaService = teaService;
	}



	public String getTeaName() {
		return teaName;
	}



	public void setTeaName(String teaName) {
		this.teaName = teaName;
	}



	public String getTeaPwd() {
		return teaPwd;
	}



	public void setTeaPwd(String teaPwd) {
		this.teaPwd = teaPwd;
	}



	public String getAuthority() {
		return authority;
	}



	public void setAuthority(String authority) {
		this.authority = authority;
	}



	@Override
	public String execute() throws Exception {
		Teacher tea = new Teacher();
		tea.setTeaName(teaName);
		tea.setTeaPwd(teaPwd);
		tea.setAuthority(authority);
		
		teaService.addTeacher(tea);
		
		return "addTeacherSuccess";
	}

}
