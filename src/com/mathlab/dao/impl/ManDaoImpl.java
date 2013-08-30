package com.mathlab.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mathlab.dao.ManDao;
import com.mathlab.model.Manager;

public class ManDaoImpl extends HibernateDaoSupport implements ManDao {

	public void insertMan(Manager man) {
		this.getHibernateTemplate().save(man);
	}

	public int queryMan(String name, String pwd) {
        String hql="from Manager where manName=? and manPwd=?";    
        Query query=this.getSession().createQuery(hql);             
        query.setParameter(0,name);                     
        query.setParameter(1,pwd);
        List list=query.list();
        return list.size();
	}

	public List<Manager> queryManByName(String name) {
        String hql="from Manager where manName=?";    
        Query query=this.getSession().createQuery(hql);             
        query.setParameter(0,name);                     
        List list = query.list();
        return list;
	}

	public void updateMan(Manager man) {
		this.getHibernateTemplate().update(man);
	}

	public Manager getMan(int id) {
		return (Manager)this.getHibernateTemplate().get(Manager.class,id);
	}

}
