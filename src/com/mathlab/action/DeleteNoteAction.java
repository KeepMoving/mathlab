package com.mathlab.action;

import com.mathlab.service.NoteService;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteNoteAction extends ActionSupport {
	private NoteService noteService;
	private int id;

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

	@Override
	public String execute() throws Exception {
		System.out.print("=======deleteAuthAction================");
		noteService.deleteNote(id);
		return "deleteNoteSucess";
	}
}
