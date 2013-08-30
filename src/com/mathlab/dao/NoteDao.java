package com.mathlab.dao;

import java.util.List;

import com.mathlab.model.Note;

public interface NoteDao {
  void insertNote(Note note);
  void deleteNote(int id);
  public List<Note> listNote();
  Note getNote(int id);
}
