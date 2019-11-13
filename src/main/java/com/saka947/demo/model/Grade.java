package com.saka947.demo.model;

import java.math.BigDecimal;
import java.util.Date;

public class Grade {
    private Integer gradeId;

    private String stuId;

    private String subjectId;

    private BigDecimal subjectMark;

    private String examName;

    private Date createTime;

    private Date updateTime;

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

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}