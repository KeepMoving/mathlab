package com.mathlab.action;

import java.util.List;

import com.mathlab.model.Experiment;
import com.mathlab.service.ExpService;
import com.opensymphony.xwork2.ActionSupport;

public class ListExpAction extends ActionSupport {

	private List<Experiment> eList;
	private ExpService expService;
	public List<Experiment> getEList() {
		return eList;
	}
	public void setEList(List<Experiment> list) {
		eList = list;
	}
	public ExpService getExpService() {
		return expService;
	}
	public void setExpService(ExpService expService) {
		this.expService = expService;
	}
	
	@Override
	public String execute() throws Exception {
		eList = expService.listExp();
		System.out.println(eList.size());
		return "success";
	}
	
	
}
