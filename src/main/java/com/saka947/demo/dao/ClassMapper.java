package com.saka947.demo.dao;

import com.saka947.demo.model.Class;


public interface ClassMapper {

    int deleteByPrimaryKey(String classId);

    int insert(Class record);

    int insertSelective(Class record);


    Class selectByPrimaryKey(String classId);


    int updateByPrimaryKeySelective(Class record);

    int updateByPrimaryKey(Class record);
}