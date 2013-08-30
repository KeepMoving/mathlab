package com.mathlab.action;

import com.mathlab.model.Experiment;
import com.mathlab.service.ExpService;
import com.mathlab.util.TimeGenerator;
import com.opensymphony.xwork2.ActionSupport;

public class AddExpAction extends ActionSupport {

	private ExpService expService;
	private String expName;
    private int course;
    private String teacher;
    private String classRoom;
    private String date;
    private int jieci;
	private String detail;
	public ExpService getExpService() {
		return expService;
	}
	public void setExpService(ExpService expService) {
		this.expService = expService;
	}
	public String getExpName() {
		return expName;
	}
	public void setExpName(String expName) {
		this.expName = expName;
	}

	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getJieci() {
		return jieci;
	}
	public void setJieci(int jieci) {
		this.jieci = jieci;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	@Override
	public String execute() throws Exception {
		Experiment exp = new Experiment();
		exp.setExpName(expName);
		exp.setCourse(course);
		exp.setTeacher(teacher);
		exp.setJieci(jieci);
		exp.setDetail(detail);
		exp.setClassRoom(classRoom);
		
		TimeGenerator timeData = new TimeGenerator();		
		date=timeData.getCurrentTime();
		exp.setDate(date);
		
		System.out.println("ccccccccccccccccccccccccccc");
		expService.addExp(exp);
		System.out.println("ddddddddddddddddddddddddddd");
		return "success";
	}
	
	
}
