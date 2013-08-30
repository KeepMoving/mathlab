package com.mathlab.service.impl;

import java.util.List;

import com.mathlab.dao.ExperimentDao;
import com.mathlab.model.Experiment;
import com.mathlab.service.ExpService;

public class ExpServiceImpl implements ExpService {

	private ExperimentDao experimentDao;
	
	public ExperimentDao getExperimentDao() {
		return experimentDao;
	}

	public void setExperimentDao(ExperimentDao experimentDao) {
		this.experimentDao = experimentDao;
	}

	public void addExp(Experiment exp) {
		System.out.println("aaaaaaaaaaaaaaaaaaaaa");
		experimentDao.insertExp(exp);
		System.out.println("bbbbbbbbbbbbbbbbbbbbb");
	}

	public List<Experiment> listExp() {
		return experimentDao.listExp();
	}

	public List<Experiment> listExpByCourseId(int courseId) {
		return experimentDao.listExpByCourseId(courseId);
	}

	
}
