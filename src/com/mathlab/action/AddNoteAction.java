package com.mathlab.action;

import java.sql.Date;

import com.mathlab.model.Note;
import com.mathlab.service.NoteService;
import com.mathlab.util.DataAccessUtil;
import com.mathlab.util.TimeGenerator;
import com.opensymphony.xwork2.ActionSupport;

public class AddNoteAction extends ActionSupport {
	private NoteService noteService;
	private int id;
	private String userName;
	private String note;
	private String date;
	public NoteService getNoteService() {
		return noteService;
	}
	public void setNoteService(NoteService noteService) {
		this.noteService = noteService;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	@Override
	public String execute() throws Exception {
		Note noteData = new Note();
		noteData.setUserName(userName);
		noteData.setNote(note);
		
		TimeGenerator timeData = new TimeGenerator();		
		date=timeData.getCurrentTime();
	    noteData.setDate(date);
	    noteService.addNote(noteData);
		return "success";
	}
}
