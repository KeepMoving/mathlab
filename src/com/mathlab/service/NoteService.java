package com.mathlab.service;

import java.util.List;

import com.mathlab.model.Note;

public interface NoteService {
  
	void addNote(Note note);
    public List<Note> listNote();
    void deleteNote(int id);
    Note getNote(int id);
}
