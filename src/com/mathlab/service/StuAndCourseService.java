package com.mathlab.service;

import java.util.List;

import com.mathlab.model.StuAndCourse;

public interface StuAndCourseService {

	void addStuAndCourse(StuAndCourse stuAndCourse);
    public List<StuAndCourse> getCourseByUsernum(String stuNum);
}
