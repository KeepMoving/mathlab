package com.mathlab.action;

import java.util.List;

import com.mathlab.model.Grade;
import com.mathlab.service.GradeService;
import com.opensymphony.xwork2.ActionSupport;

public class ListGradeAction extends ActionSupport {
    private List<Grade> gList;
    private GradeService gradeService;
    
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

	@Override
	public String execute() throws Exception {
		System.out.print("=======FindallActon================");
		gList = gradeService.listGrade();
		System.out.print(gList.size());
		return "listGradeSuccess";
	}

}
