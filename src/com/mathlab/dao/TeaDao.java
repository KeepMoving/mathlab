package com.mathlab.dao;

import java.util.List;

import com.mathlab.model.Authority;
import com.mathlab.model.Teacher;

public interface TeaDao {
	void insertTea(Teacher tea);
	public List<Teacher> listTea();
    public int queryTea(String name,String pwd);
	public List<Teacher> queryTeaByName(String name);
	void updateTea(Teacher tea);
	public Teacher getTea(int id);
	void deleteTea(int id);
}
