package com.mathlab.action;

import java.util.List;

import com.mathlab.model.Teacher;
import com.mathlab.service.TeaService;
import com.opensymphony.xwork2.ActionSupport;

public class ListTeaAction extends ActionSupport {
    private List<Teacher> tList;
    private TeaService teaService;

	public List<Teacher> getTList() {
		return tList;
	}

	public void setTList(List<Teacher> list) {
		tList = list;
	}

	public TeaService getTeaService() {
		return teaService;
	}

	public void setTeaService(TeaService teaService) {
		this.teaService = teaService;
	}

	@Override
	public String execute() throws Exception {
		System.out.print("=======FindallActon================");
		tList = teaService.listTea();
		System.out.print(tList.size());
		return "listTeaSuccess";
	}

}
