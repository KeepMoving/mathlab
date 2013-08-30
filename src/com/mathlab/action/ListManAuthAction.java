package com.mathlab.action;

import java.util.List;

import com.mathlab.model.Authority;
import com.mathlab.service.AuthService;
import com.opensymphony.xwork2.ActionSupport;

public class ListManAuthAction extends ActionSupport {
	    private List<Authority> aList;
	    private AuthService authService;

		public List<Authority> getAList() {
			return aList;
		}
		public void setAList(List<Authority> list) {
			aList = list;
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
			aList = authService.listAuth();
			System.out.print(aList.size());
			return "listManAuthSuccess";
		}
}
