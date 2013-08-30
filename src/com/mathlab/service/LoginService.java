package com.mathlab.service;

import java.util.List;

import com.mathlab.model.Manager;
import com.mathlab.model.Student;
import com.mathlab.model.Teacher;

public interface LoginService {
	   public int queryStudent(String name,String pwd);
	   public int queryManager(String name,String pwd);
	   public int queryTeacher(String name,String pwd);	   
}
