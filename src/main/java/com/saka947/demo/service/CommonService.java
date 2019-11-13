package com.saka947.demo.service;

import com.saka947.demo.model.Class;
import com.saka947.demo.model.Department;
import com.saka947.demo.model.Student;
import com.saka947.demo.model.Subject;

public interface CommonService {
    int insertSubject(Subject subject);
    int insertStudent(Student student);
    int insertDepartment(Department department);
    int insertClass(Class class_);

}
