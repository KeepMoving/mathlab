package com.mathlab.action;

import java.sql.Date;

import com.mathlab.model.Note;
import com.mathlab.service.NoteService;
import com.mathlab.util.DataAccessUtil;
import com.mathlab.util.TimeGenerator;
import com.opensymphony.xwork2.ActionSupport;

public class PreReplyNoteAction extends ActionSupport {
	private NoteService noteService;
	private int id;
	private Note noteModel;
	
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

	public Note getNoteModel() {
		return noteModel;
	}

	public void setNoteModel(Note noteModel) {
		this.noteModel = noteModel;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("PreReplyNoteAction");
		noteModel = noteService.getNote(id);
		if(noteModel != null){
			System.out.println("PreReplyNoteAction完成!");
		}
		return "success";
	}
}
