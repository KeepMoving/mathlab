package com.mathlab.action;

import com.mathlab.service.StuService;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteStuAction extends ActionSupport {
	private StuService stuService;
	private int id;
	
	public StuService getStuService() {
		return stuService;
	}

	public void setStuService(StuService stuService) {
		this.stuService = stuService;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String execute() throws Exception {
		System.out.print("=======deleteStuAction================");
		stuService.deleteStu(id);
		return "deleteStuSuccess";
	}
}
