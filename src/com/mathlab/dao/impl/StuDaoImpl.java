package com.mathlab.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mathlab.dao.StuDao;
import com.mathlab.model.Student;

public class StuDaoImpl extends HibernateDaoSupport implements StuDao {

	public void insertStu(Student Student) {
		this.getHibernateTemplate().save(Student);
	}

	public int queryStu(String name, String pwd) {
        String hql="from Student stu where stu.stuName=? and stu.stuPwd=?";    
        Query query=this.getSession().createQuery(hql);             
        query.setParameter(0,name);                     
        query.setParameter(1,pwd);
        System.out.println(hql);
        List list=query.list();
        System.out.println(list.size());
        return list.size();
	}

	public List<Student> listStu() {
		String sql ="from Student";
		return (List<Student>)this.getHibernateTemplate().find(sql);
	}

	public String queryStuByUsername(String name) {
        String hql="from Student stu where stu.stuName=?";    
        Query query=this.getSession().createQuery(hql);             
        query.setParameter(0,name);                     
        System.out.println(hql);
        String stuNum = "";
        System.out.println("stuNum1=   "+stuNum);
        try {
        	System.out.println("共有"+query.list().size()+"条记录符合要求");
			Student stu = (Student)query.list().get(0);
			
	        System.out.println("aaaaaaaaaaaaaaaaaaaaaaa");
			stuNum = stu.getStuNum();
			System.out.println("stuNum2=   "+stuNum);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return stuNum;
	}

	public List<Student> queryStuByName(String name) {
        String hql="from Student where realName=?";    
        Query query=this.getSession().createQuery(hql);             
        query.setParameter(0,name);                     
        List list = query.list();
        return list;
	}

	public void updateStu(Student stu) {
		this.getHibernateTemplate().update(stu);	
	}

	public Student getStu(int id) {
		return (Student)this.getHibernateTemplate().get(Student.class,id);
	}

	public void deleteStu(int id) {
		String sql ="delete from Student where id=:pn";
		System.out.println(sql);
		this.getSession().createQuery(sql).setParameter("pn", id).executeUpdate();
	}	
}
