package com.mathlab.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mathlab.dao.TeaDao;
import com.mathlab.model.Teacher;

public class TeaDaoImpl extends HibernateDaoSupport implements TeaDao {

	public void insertTea(Teacher tea) {
		this.getHibernateTemplate().save(tea);
	}

	public List<Teacher> listTea() {
		String sql ="from Teacher";
		return (List<Teacher>)this.getHibernateTemplate().find(sql);
	}

	public int queryTea(String name, String pwd) {
        String hql="from Teacher where teaName=? and teaPwd=?";    
        Query query=this.getSession().createQuery(hql);             
        query.setParameter(0,name);                     
        query.setParameter(1,pwd);
        List list=query.list();
        return list.size();
	}

	public List<Teacher> queryTeaByName(String name) {
        String hql="from Teacher where teaName=?";    
        Query query=this.getSession().createQuery(hql);             
        query.setParameter(0,name);                     
        List list = query.list();
        return list;
	}

	public void updateTea(Teacher tea) {
		this.getHibernateTemplate().update(tea);	
	}

	public Teacher getTea(int id) {
		return (Teacher)this.getHibernateTemplate().get(Teacher.class,id);
	}

	public void deleteTea(int id) {
		String sql ="delete from Teacher where id=:pn";
		System.out.println(sql);
		this.getSession().createQuery(sql).setParameter("pn", id).executeUpdate();
	}
	
	
}
