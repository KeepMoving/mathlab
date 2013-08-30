package com.mathlab.dao;

import java.util.List;

import com.mathlab.model.Student;

public interface StuDao {
	  void insertStu(Student Student);
	  public int queryStu(String name,String pwd);
	  public List<Student> listStu();
	  public String queryStuByUsername(String name);
	  public List<Student> queryStuByName(String name);
	  void updateStu(Student stu);
	  public Student getStu(int id);
	  void deleteStu(int id);
}
