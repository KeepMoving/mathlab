package com.mathlab.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mathlab.dao.NoteDao;
import com.mathlab.model.Note;

public class NoteDaoImpl extends HibernateDaoSupport implements NoteDao {

	public void deleteNote(int id) {
		String sql ="delete from Note where id=:pn";
		System.out.println(sql);
		this.getSession().createQuery(sql).setParameter("pn", id).executeUpdate();
	}

	public void insertNote(Note note) {
			this.getHibernateTemplate().save(note);
	}

	public List<Note> listNote() {
		String sql ="from Note";
		return (List<Note>)this.getHibernateTemplate().find(sql);
	}

	public Note getNote(int id) {
		return (Note)this.getHibernateTemplate().get(Note.class,id);
	}

}
