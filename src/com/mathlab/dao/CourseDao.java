package com.mathlab.dao;

import java.util.List;

import com.mathlab.model.Course;

public interface CourseDao {
	  void insertCourse(Course course);
	  public List<Course> listCourse();
}
