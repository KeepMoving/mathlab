package com.mathlab.action;

import com.mathlab.model.Manager;
import com.mathlab.service.ManService;
import com.opensymphony.xwork2.ActionSupport;

public class AddManagerAction extends ActionSupport {

	private ManService manService;
	private String manName;
	private String manPwd;
	private String authority;

	public ManService getManService() {
		return manService;
	}

	public void setManService(ManService manService) {
		this.manService = manService;
	}

	public String getManName() {
		return manName;
	}

	public void setManName(String manName) {
		this.manName = manName;
	}

	public String getManPwd() {
		return manPwd;
	}

	public void setManPwd(String manPwd) {
		this.manPwd = manPwd;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public String execute() throws Exception {
		Manager man = new Manager();
        man.setManName(manName);
        man.setManPwd(manPwd);
        man.setAuthority(authority);
	    manService.addManager(man);
		
		return "addManagerSuccess";
	}

}
