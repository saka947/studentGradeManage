package com.saka947.demo.model;

import java.math.BigDecimal;

public class Grade {
    private Integer gradeId;

    private String stuId;

    private String subjectId;

    private BigDecimal subjectMark;

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public BigDecimal getSubjectMark() {
        return subjectMark;
    }

    public void setSubjectMark(BigDecimal subjectMark) {
        this.subjectMark = subjectMark;
    }
}