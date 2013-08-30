package com.mathlab.model;

public class Experiment {
	private Integer expID;
	private String expName;
    private int course;
    private String teacher;
    private String classRoom;
    private String date;
    private Integer jieci;
	private String detail;
	public Integer getExpID() {
		return expID;
	}
	public void setExpID(Integer expID) {
		this.expID = expID;
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
	public Integer getJieci() {
		return jieci;
	}
	public void setJieci(Integer jieci) {
		this.jieci = jieci;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}	
}
