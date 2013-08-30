package com.mathlab.dao;

import java.util.List;

import com.mathlab.model.Experiment;

public interface ExperimentDao {
	  void insertExp(Experiment exp);
	  public List<Experiment> listExp();
	  public List<Experiment> listExpByCourseId(int courseId);
}
