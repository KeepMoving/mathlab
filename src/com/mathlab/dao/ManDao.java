package com.mathlab.dao;

import java.util.List;

import com.mathlab.model.Authority;
import com.mathlab.model.Manager;

public interface ManDao {
	void insertMan(Manager man);
	public int queryMan(String name,String pwd);
	public List<Manager> queryManByName(String name);
	void updateMan(Manager man);
    public Manager getMan(int id);
}
