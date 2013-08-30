package com.mathlab.action;


import com.mathlab.model.Student;
import com.mathlab.service.StuService;
import com.opensymphony.xwork2.ActionSupport;

public class PreEditStuAction extends ActionSupport {
	private StuService stuService;
	private Integer id;
	private Student stu;

	public StuService getStuService() {
		return stuService;
	}
	
	public void setStuService(StuService stuService) {
		this.stuService = stuService;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Student getStu() {
		return stu;
	}
	
	public void setStu(Student stu) {
		this.stu = stu;
	}

	@Override
	public String execute() throws Exception {
		stu = stuService.getStu(id);
		if(stu.toString() !=null){
		  return "success";
		}else{
			return "input";
		}
	}

}
