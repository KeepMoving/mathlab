package com.mathlab.action;

import java.util.List;

import com.mathlab.model.Student;
import com.mathlab.service.StuService;
import com.opensymphony.xwork2.ActionSupport;

public class ListStuAction extends ActionSupport {
	private List<Student> sList;
	private StuService stuService;
	
	public List<Student> getSList() {
		return sList;
	}

	public void setSList(List<Student> list) {
		sList = list;
	}

	public StuService getStuService() {
		return stuService;
	}

	public void setStuService(StuService stuService) {
		this.stuService = stuService;
	}

	@Override
	public String execute() throws Exception {
		System.out.print("=======FindallNote================");
		sList = stuService.listStu();
		System.out.print(sList.size());
		return "listStuSuccess";
	}
}
