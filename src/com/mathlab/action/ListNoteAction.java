package com.mathlab.action;

import java.util.List;

import com.mathlab.model.Note;
import com.mathlab.service.NoteService;
import com.opensymphony.xwork2.ActionSupport;

public class ListNoteAction extends ActionSupport {
	private List<Note> nList;
	private NoteService noteService;
	
	public List<Note> getNList() {
		return nList;
	}

	public void setNList(List<Note> list) {
		nList = list;
	}

	public NoteService getNoteService() {
		return noteService;
	}

	public void setNoteService(NoteService noteService) {
		this.noteService = noteService;
	}

	@Override
	public String execute() throws Exception {
		System.out.print("=======FindallNote================");
		nList = noteService.listNote();
		System.out.print(nList.size());
		return "listNoteSuccess";
	}
}
