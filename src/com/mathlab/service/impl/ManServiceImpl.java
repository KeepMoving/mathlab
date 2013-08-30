package com.mathlab.service.impl;

import java.util.List;

import com.mathlab.dao.ManDao;
import com.mathlab.model.Manager;
import com.mathlab.service.ManService;

public class ManServiceImpl implements ManService {

	private ManDao manDao;
	
	public ManDao getManDao() {
		return manDao;
	}

	public void setManDao(ManDao manDao) {
		this.manDao = manDao;
	}

	public void addManager(Manager man) {
		manDao.insertMan(man);
	}

	public List<Manager> queryManByName(String name) {	
		return manDao.queryManByName(name);
	}

	public void updateMan(Manager man) {
		manDao.updateMan(man);
	}

	public Manager getMan(int id) {
		return manDao.getMan(id);
	}
}
