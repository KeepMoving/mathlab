package com.mathlab.action;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.mathlab.service.LoginService;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

	private LoginService loginService;
	private String username;
	private String userpwd;
	private String userAuth;
	public LoginService getLoginService() {
		return loginService;
	}
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	public String getUserAuth() {
		return userAuth;
	}
	public void setUserAuth(String userAuth) {
		this.userAuth = userAuth;
	}
	@Override
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest(); 
		//HttpServletResponse response = ServletActionContext.getResponse(); 
		HttpSession session = request.getSession();
		
		System.out.println("查询用户:"+userAuth);
		System.out.println("ID:     "+username);
		System.out.println("密码:     "+userpwd);
		if(userAuth.equals("学生")){
			int numOfStu = loginService.queryStudent(username, userpwd);
			if(numOfStu != 0){
				session.setAttribute("user",username);
				return "stuLoginSuccess";
			}
		}if(userAuth.equals("教师")){
			int numOfTea = loginService.queryTeacher(username, userpwd);
			if(numOfTea != 0){
				session.setAttribute("user",username);
				return "teaLoginSuccess";
			}
		}else{
			int numOfMan= loginService.queryManager(username, userpwd);
			if(numOfMan != 0){
				session.setAttribute("user",username);
				return "manLoginSuccess";
			}
		}
        return "userAuthError";
	}
	
}
