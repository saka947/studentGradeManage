package com.saka947.demo.service;

import com.saka947.demo.model.Grade;

import java.util.List;

public interface GradeService {
    int insertOrUpdateGrade(Grade grade);
    int deleteGrade(Integer gradeId);
    List<Grade> getGradesByProperties(Grade grade);
}
