package com.mathlab.action;


import com.mathlab.model.Authority;
import com.mathlab.service.AuthService;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class PreEditAuthAction extends ActionSupport {
  private AuthService authService;
  private Authority auth;
	private Integer id;

	public Authority getAuth() {
		return auth;
	}

	public void setAuth(Authority auth) {
		this.auth = auth;
	}
	
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

@Override
public String execute() throws Exception {
	auth=authService.queryAuth(id);
	if(auth != null){
	  return "success";
	}else{
		return "input";
	}
}

}
