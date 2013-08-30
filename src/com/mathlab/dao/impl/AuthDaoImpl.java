package com.mathlab.dao.impl;


import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mathlab.dao.AuthDao;
import com.mathlab.model.Authority;

public class AuthDaoImpl extends HibernateDaoSupport implements AuthDao {
	

	
	public void insertAuth(Authority auth) {
		this.getHibernateTemplate().save(auth);
	}

	public void deleteAuth(int id){
		String sql ="delete from Authority where id=:pn";
		System.out.println(sql);
		this.getSession().createQuery(sql).setParameter("pn", id).executeUpdate();
	}
	
	public List<Authority> listAuth(){
		String sql ="from Authority";
		return (List<Authority>)this.getHibernateTemplate().find(sql);
	}
	
	public void updateAuth(Authority auth){
		this.getHibernateTemplate().update(auth);
	}
	
	public Authority getAuth(int id){
		return (Authority)this.getHibernateTemplate().get(Authority.class,id);
	}
}
