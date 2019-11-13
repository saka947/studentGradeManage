package com.saka947.demo.service.impl;

import com.saka947.demo.dao.GradeMapper;
import com.saka947.demo.model.Grade;
import com.saka947.demo.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class GradeServiceImpl implements GradeService {
    @Autowired
    private GradeMapper gradeMapper;

    @Override
    public int insertOrUpdateGrade(Grade grade) {
        if (grade.getGradeId()==null){
            //已存在
            if (gradeMapper.getIfExist(grade)!=null){
                return -1;
            }
            //新增
            grade.setCreateTime(new Date());
            grade.setUpdateTime(new Date());
            return gradeMapper.insertSelective(grade);
        }else {
            //编辑
            grade.setUpdateTime(new Date());
            return gradeMapper.updateByPrimaryKeySelective(grade);
        }
    }

    @Override
    public int deleteGrade(Integer gradeId) {
        return gradeMapper.deleteByPrimaryKey(gradeId);
    }

    @Override
    public List<Grade> getGradesByProperties(Grade grade) {
        return gradeMapper.selectGrades(grade);
    }
}
