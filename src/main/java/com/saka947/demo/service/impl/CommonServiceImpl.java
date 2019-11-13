package com.saka947.demo.service.impl;

import com.saka947.demo.dao.*;
import com.saka947.demo.model.Class;
import com.saka947.demo.model.Department;
import com.saka947.demo.model.Student;
import com.saka947.demo.model.Subject;
import com.saka947.demo.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonServiceImpl implements CommonService {
    @Autowired
    private ClassMapper classMapper;
    @Autowired
    private DepartmentMapper departmentMapper;
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private SubjectMapper subjectMapper;

    @Override
    public int insertSubject(Subject subject) {
        return subjectMapper.insert(subject);
    }

    @Override
    public int insertStudent(Student student) {
        return studentMapper.insert(student);
    }

    @Override
    public int insertDepartment(Department department) {
        return departmentMapper.insert(department);
    }

    @Override
    public int insertClass(Class class_) {
        return classMapper.insert(class_);
    }
}
