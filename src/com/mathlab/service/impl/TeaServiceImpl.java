package com.mathlab.service.impl;

import java.util.List;

import com.mathlab.dao.TeaDao;
import com.mathlab.model.Teacher;
import com.mathlab.service.TeaService;

public class TeaServiceImpl implements TeaService {
	private TeaDao teaDao;

	public TeaDao getTeaDao() {
		return teaDao;
	}

	public void setTeaDao(TeaDao teaDao) {
		this.teaDao = teaDao;
	}

	public void addTeacher(Teacher tea) {
		teaDao.insertTea(tea);
	}

	public List<Teacher> listTea() {
		return teaDao.listTea();
	}

	public List<Teacher> queryTeaByName(String name) {
		return teaDao.queryTeaByName(name);
	}

	public void updateTea(Teacher tea) {
		teaDao.updateTea(tea);
	}

	public Teacher getTea(int id) {
		return teaDao.getTea(id);
	}

	public void deleteTea(int id) {
		teaDao.deleteTea(id);		
	}
}
