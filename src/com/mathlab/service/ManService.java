package com.mathlab.service;

import java.util.List;

import com.mathlab.model.Manager;

public interface ManService {
	void addManager(Manager man);
	List<Manager> queryManByName(String name);
	void updateMan(Manager man);
	Manager getMan(int id);
}
