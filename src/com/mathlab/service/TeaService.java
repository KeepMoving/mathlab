package com.mathlab.service;

import java.util.List;

import com.mathlab.model.Teacher;

public interface TeaService {
	void addTeacher(Teacher tea);
    public List<Teacher> listTea();
    List<Teacher> queryTeaByName(String name);
    void updateTea(Teacher tea);
    Teacher getTea(int id);
    void deleteTea(int id);
}
