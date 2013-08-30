package com.mathlab.service.impl;

import java.util.List;

import com.mathlab.dao.GradeDao;
import com.mathlab.model.Grade;
import com.mathlab.service.GradeService;

public class GradeServiceImpl implements GradeService {

	private GradeDao gradeDao;
	
	public GradeDao getGradeDao() {
		return gradeDao;
	}

	public void setGradeDao(GradeDao gradeDao) {
		this.gradeDao = gradeDao;
	}

	public void addGrade(Grade grade) {
		gradeDao.insertGrade(grade);	
	}

	public List<Grade> listGrade() {
		return gradeDao.listGrade();
	}

}
