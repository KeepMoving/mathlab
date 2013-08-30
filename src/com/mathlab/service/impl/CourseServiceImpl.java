package com.mathlab.service.impl;

import java.util.List;

import com.mathlab.dao.CourseDao;
import com.mathlab.model.Course;
import com.mathlab.service.CourseService;

public class CourseServiceImpl implements CourseService {

	private CourseDao courseDao;
	
	public CourseDao getCourseDao() {
		return courseDao;
	}

	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
	}

	public void addCourse(Course course) {
		courseDao.insertCourse(course);
	}

	public List<Course> listCourse() {
		return courseDao.listCourse();
	}

	
}
