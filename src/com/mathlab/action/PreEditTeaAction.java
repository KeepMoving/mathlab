package com.mathlab.action;


import com.mathlab.model.Teacher;
import com.mathlab.service.TeaService;
import com.opensymphony.xwork2.ActionSupport;

public class PreEditTeaAction extends ActionSupport {
	private TeaService teaService;
	private Integer id;
	private Teacher tea;

	public TeaService getTeaService() {
		return teaService;
	}

	public void setTeaService(TeaService teaService) {
		this.teaService = teaService;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Teacher getTea() {
		return tea;
	}

	public void setTea(Teacher tea) {
		this.tea = tea;
	}

	@Override
	public String execute() throws Exception {
		tea = teaService.getTea(id);
		if(tea.toString() !=null){
		  return "success";
		}else{
			return "input";
		}
	}

}
