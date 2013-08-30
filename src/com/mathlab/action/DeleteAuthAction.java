package com.mathlab.action;


import com.mathlab.service.AuthService;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteAuthAction extends ActionSupport {
	private AuthService authService;
	private int id;

	public AuthService getAuthService() {
		return authService;
	}

	public void setAuthService(AuthService authService) {
		this.authService = authService;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String execute() throws Exception {
		System.out.print("=======deleteAuthAction================");
		authService.deleteAuth(id);
		return "deleteAuthSucess";
	}

}
