package com.saka947.demo.dao;

import com.saka947.demo.model.Subject;


public interface SubjectMapper {

    int deleteByPrimaryKey(String subjectId);

    int insert(Subject record);

    int insertSelective(Subject record);

    Subject selectByPrimaryKey(String subjectId);


    int updateByPrimaryKeySelective(Subject record);

    int updateByPrimaryKey(Subject record);
}