package com.mathlab.service;

import java.util.List;

import com.mathlab.model.Experiment;

public interface ExpService {
  
	void addExp(Experiment exp);
    public List<Experiment> listExp();
    public List<Experiment> listExpByCourseId(int courseId);    
}
