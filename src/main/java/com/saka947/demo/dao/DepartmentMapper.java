package com.saka947.demo.dao;

import com.saka947.demo.model.Department;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepartmentMapper {


    int deleteByPrimaryKey(String departId);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(String departId);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}