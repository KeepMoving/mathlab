package com.mathlab.service.impl;

import java.util.List;

import com.mathlab.dao.StuAndCourseDao;
import com.mathlab.model.StuAndCourse;
import com.mathlab.service.StuAndCourseService;

public class StuAndCourseServiceImpl implements StuAndCourseService {

	StuAndCourseDao stuAndCourseDao;
	
	public StuAndCourseDao getStuAndCourseDao() {
		return stuAndCourseDao;
	}

	public void setStuAndCourseDao(StuAndCourseDao stuAndCourseDao) {
		this.stuAndCourseDao = stuAndCourseDao;
	}

	public void addStuAndCourse(StuAndCourse stuAndCourse) {
		stuAndCourseDao.insertStuAndCourse(stuAndCourse);
	}

	public List<StuAndCourse> getCourseByUsernum(String stuNum) {
		return stuAndCourseDao.queryCourseByUsernum(stuNum);
	}

}
