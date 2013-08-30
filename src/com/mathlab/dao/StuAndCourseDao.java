package com.mathlab.dao;

import java.util.List;

import com.mathlab.model.StuAndCourse;

public interface StuAndCourseDao {
	  void insertStuAndCourse(StuAndCourse stuAndCourse);
	  public List<StuAndCourse> queryCourseByUsernum(String stuNum);
}
