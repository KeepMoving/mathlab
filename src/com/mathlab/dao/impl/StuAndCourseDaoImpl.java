package com.mathlab.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mathlab.dao.StuAndCourseDao;
import com.mathlab.model.StuAndCourse;

public class StuAndCourseDaoImpl extends HibernateDaoSupport implements StuAndCourseDao {

	public void insertStuAndCourse(StuAndCourse stuAndCourse) {
		this.getHibernateTemplate().save(stuAndCourse);
	}

	public List<StuAndCourse> queryCourseByUsernum(String stuNum) {
        String hql="from StuAndCourse stuAndCourse where stuAndCourse.stuNum=?";    
        Query query=this.getSession().createQuery(hql);             
        query.setParameter(0,stuNum);                     
        System.out.println(hql);
          	
		System.out.println("共有"+query.list().size()+"条记录符合要求");
		return (List<StuAndCourse>)query.list();
	}

	
}
