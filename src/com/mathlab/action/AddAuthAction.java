package com.mathlab.action;


import com.mathlab.model.Authority;
import com.mathlab.service.AuthService;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class AddAuthAction extends ActionSupport {
  private AuthService authService;
  
	private Integer id;
	private String authName;
	private String detail;
	
public AuthService getAuthService() {
		return authService;
	}

	public void setAuthService(AuthService authService) {
		this.authService = authService;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAuthName() {
		return authName;
	}

	public void setAuthName(String authName) {
		this.authName = authName;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

@Override
public String execute() throws Exception {
	Authority auth = new Authority();
	auth.setAuthName(authName);
	auth.setDetail(detail);
    authService.addAuth(auth);
	return "addAuthSucess";
}

}
