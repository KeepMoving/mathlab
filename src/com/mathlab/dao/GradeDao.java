package com.mathlab.dao;

import java.util.List;

import com.mathlab.model.Grade;

public interface GradeDao {

	  void insertGrade(Grade grade);
	  public List<Grade> listGrade();	  
}
