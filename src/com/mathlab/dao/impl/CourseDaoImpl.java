package com.mathlab.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mathlab.dao.CourseDao;
import com.mathlab.model.Authority;
import com.mathlab.model.Course;

public class CourseDaoImpl extends HibernateDaoSupport implements CourseDao {

	public void insertCourse(Course course) {
		this.getHibernateTemplate().save(course);
	}

	public List<Course> listCourse() {
		String sql ="from Course";
		return (List<Course>)this.getHibernateTemplate().find(sql);
	}	
}
