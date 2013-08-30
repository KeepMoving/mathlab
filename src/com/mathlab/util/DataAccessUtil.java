package com.mathlab.util;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class DataAccessUtil extends HibernateDaoSupport {

	public List find(String queryString, Object[] params){
		return getHibernateTemplate().find(queryString, params);
    }

    public List find(String queryString, Object param){
	    return getHibernateTemplate().find(queryString, param);
    }

    public void create(Object entity){
		getHibernateTemplate().save(entity);
    }

    public List find(String queryString){
	    return getHibernateTemplate().find(queryString);
    }
    
    public void update(Object entity){
		getHibernateTemplate().update(entity);
	}
    public void delete(String  sql){
		getHibernateTemplate().delete(sql);
	}
}
