package com.mathlab.action;

import com.mathlab.service.TeaService;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteTeaAction extends ActionSupport {
	private TeaService teaService;
	private int id;

	public TeaService getTeaService() {
		return teaService;
	}

	public void setTeaService(TeaService teaService) {
		this.teaService = teaService;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String execute() throws Exception {
		System.out.print("=======deleteTeaAction================");
		teaService.deleteTea(id);
		return "deleteTeaSuccess";
	}
}
