package com.mathlab.service;

import java.util.List;

import com.mathlab.model.Course;

public interface CourseService {

	void addCourse(Course course);
    public List<Course> listCourse();
}
