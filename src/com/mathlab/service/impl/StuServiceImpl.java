package com.mathlab.service.impl;

import java.util.List;

import com.mathlab.dao.StuDao;
import com.mathlab.model.Student;
import com.mathlab.service.StuService;


public class StuServiceImpl implements StuService {
     
	private StuDao stuDao;
	public StuDao getStuDao() {
		return stuDao;
	}
	public void setStuDao(StuDao stuDao) {
		this.stuDao = stuDao;
	}
	public void addStu(Student stu) {
		stuDao.insertStu(stu);
	}
	public List<Student> listStu() {
		return stuDao.listStu();
	}
	public String getStuNumByUsername(String name) {
		return stuDao.queryStuByUsername(name);
	}
	public List<Student> queryStuByName(String name) {
		return stuDao.queryStuByName(name);
	}
	public void updateStu(Student stu) {
		stuDao.updateStu(stu);
	}
	public Student getStu(int id) {
		return stuDao.getStu(id);
	}
	public void deleteStu(int id) {
		stuDao.deleteStu(id);
	}
}
