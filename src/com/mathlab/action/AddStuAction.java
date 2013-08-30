package com.mathlab.action;

import com.mathlab.model.Student;
import com.mathlab.service.StuService;
import com.opensymphony.xwork2.ActionSupport;

public class AddStuAction extends ActionSupport {

	private StuService stuService;
	private String stuName;
	private String stuPwd;
	private String realName;
	private String stuNum;
	private String grade;
	private String authority;
	
	public StuService getStuService() {
		return stuService;
	}
	public void setStuService(StuService stuService) {
		this.stuService = stuService;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuPwd() {
		return stuPwd;
	}
	public void setStuPwd(String stuPwd) {
		this.stuPwd = stuPwd;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getStuNum() {
		return stuNum;
	}
	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	@Override
	public String execute() throws Exception {
         Student stu = new Student();
         stu.setStuName(stuName);
         stu.setStuPwd(stuPwd);
         stu.setRealName(realName);
         stu.setStuNum(stuNum);
         stu.setGrade(grade);
         stu.setAuthority(authority);
         stuService.addStu(stu);
         return "addStuSuccess";
	}
	
}
