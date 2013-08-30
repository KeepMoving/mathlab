package com.mathlab.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mathlab.dao.GradeDao;
import com.mathlab.model.Grade;

public class GradeDaoImpl extends HibernateDaoSupport implements GradeDao {

	public void insertGrade(Grade grade) {
		this.getHibernateTemplate().save(grade);
	}

	public List<Grade> listGrade() {
		String sql ="from Grade";
		return (List<Grade>)this.getHibernateTemplate().find(sql);
	}
	
}
