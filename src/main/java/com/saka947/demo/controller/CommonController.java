package com.saka947.demo.controller;


import com.saka947.demo.model.Class;
import com.saka947.demo.model.Department;
import com.saka947.demo.model.Student;
import com.saka947.demo.model.Subject;
import com.saka947.demo.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class CommonController extends BaseController{
    @Autowired
    private CommonService commonService;


    @RequestMapping(value = "/addStudent.ajax")
    @ResponseBody
    public Map<String, Object> addStudent(Student student) {
        int count = commonService.insertStudent(student);
        if (count>0){
            return super.success("成功");
        }
        return super.fail("失败");
    }

    @RequestMapping(value = "/addSubject.ajax")
    @ResponseBody
    public Map<String,Object> addSubject(Subject subject){
        int count = commonService.insertSubject(subject);
        if (count>0){
            return super.success("成功");
        }
        return super.fail("失败");
    }

    @RequestMapping(value = "/addClass.ajax")
    @ResponseBody
    public Map<String,Object> addClass(Class class_){
        int count = commonService.insertClass(class_);
        if (count>0){
            return super.success("成功");
        }
        return super.fail("失败");
    }


    @RequestMapping(value = "/addDepartment.ajax")
    @ResponseBody
    public Map<String,Object> addDepartment(Department department){
        int count = commonService.insertDepartment(department);
        if (count>0){
            return super.success("成功");
        }
        return super.fail("失败");
    }


}
