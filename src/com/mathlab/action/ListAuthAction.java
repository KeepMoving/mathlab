package com.mathlab.action;

import java.util.List;

import com.mathlab.model.Authority;
import com.mathlab.service.AuthService;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class ListAuthAction extends ActionSupport {
	 private List<Authority> pList;
	    private AuthService authService;
	
		public List<Authority> getPList() {
			return pList;
		}
		public void setPList(List<Authority> list) {
			pList = list;
		}

	public AuthService getAuthService() {
			return authService;
		}
		public void setAuthService(AuthService authService) {
			this.authService = authService;
		}
	@Override
	public String execute() throws Exception {
		System.out.print("=======FindallActon================");
		pList = authService.listAuth();
		System.out.print(pList.size());
		return "listAuthSucess";
	}

}
