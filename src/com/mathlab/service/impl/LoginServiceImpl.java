package com.mathlab.service.impl;

import java.util.List;

import com.mathlab.dao.ManDao;
import com.mathlab.dao.StuDao;
import com.mathlab.dao.TeaDao;
import com.mathlab.model.Manager;
import com.mathlab.model.Student;
import com.mathlab.model.Teacher;
import com.mathlab.service.LoginService;

public class LoginServiceImpl implements LoginService {

	private StuDao stuDao;
	private ManDao manDao;
	private TeaDao teaDao;
	
	public StuDao getStuDao() {
		return stuDao;
	}

	public void setStuDao(StuDao stuDao) {
		this.stuDao = stuDao;
	}

	public ManDao getManDao() {
		return manDao;
	}

	public void setManDao(ManDao manDao) {
		this.manDao = manDao;
	}

	public TeaDao getTeaDao() {
		return teaDao;
	}

	public void setTeaDao(TeaDao teaDao) {
		this.teaDao = teaDao;
	}

	public int queryManager(String name, String pwd) {
		return manDao.queryMan(name, pwd);
	}

	public int queryStudent(String name, String pwd) {
        return stuDao.queryStu(name, pwd);
	}

	public int queryTeacher(String name, String pwd) {
        return teaDao.queryTea(name, pwd);
	}

}
