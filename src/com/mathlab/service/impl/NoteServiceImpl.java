package com.mathlab.service.impl;

import java.util.List;

import com.mathlab.dao.NoteDao;
import com.mathlab.model.Note;
import com.mathlab.service.NoteService;

public class NoteServiceImpl implements NoteService {
	private NoteDao noteDao;

	public NoteDao getNoteDao() {
		return noteDao;
	}

	public void setNoteDao(NoteDao noteDao) {
		this.noteDao = noteDao;
	}

	public void addNote(Note note) {
		noteDao.insertNote(note);
	}

	public void deleteNote(int id) {
		noteDao.deleteNote(id);
	}

	public List<Note> listNote() {
		return noteDao.listNote();
	}

	public Note getNote(int id) {
		return noteDao.getNote(id);
	}
}
