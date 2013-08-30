package com.mathlab.service;

import java.util.List;

import com.mathlab.model.Student;

public interface StuService {
  
	void addStu(Student stu);
    public List<Student> listStu();
    public String getStuNumByUsername(String name);
	List<Student> queryStuByName(String name);
	void updateStu(Student stu);
	Student getStu(int id);
    void deleteStu(int id);
}
