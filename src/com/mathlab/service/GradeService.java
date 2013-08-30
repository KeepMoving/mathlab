package com.mathlab.service;

import java.util.List;

import com.mathlab.model.Grade;

public interface GradeService {

	void addGrade(Grade grade);	
    public List<Grade> listGrade();
}
