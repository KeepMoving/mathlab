package com.mathlab.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mathlab.dao.ExperimentDao;
import com.mathlab.model.Experiment;
import com.mathlab.model.Student;

public class ExperimentDaoImpl extends HibernateDaoSupport implements ExperimentDao {

	public void insertExp(Experiment exp) {
		this.getHibernateTemplate().save(exp);
	}

	public List<Experiment> listExp() {
		String sql ="from Experiment";
		return (List<Experiment>)this.getHibernateTemplate().find(sql);
	}

	public List<Experiment> listExpByCourseId(int courseId) {
        String hql="from Experiment exp where exp.course=?";    
        Query query=this.getSession().createQuery(hql);             
        query.setParameter(0,courseId);                     
        System.out.println(hql);
        List<Experiment> eList = query.list();
        return eList;
	}

}
