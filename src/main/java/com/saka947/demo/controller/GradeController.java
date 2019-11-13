package com.saka947.demo.controller;

import com.saka947.demo.model.Grade;
import com.saka947.demo.model.Student;
import com.saka947.demo.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/grade")
public class GradeController extends BaseController {
    @Autowired
    private GradeService gradeService;

    @RequestMapping(value = "/getGrade.ajax")
    @ResponseBody
    public Map<String, Object> getGrade(@ModelAttribute Grade grade) {
        try {
            List<Grade> list = gradeService.getGradesByProperties(grade);
            return super.success(list);
        }catch (Exception e){
            return super.fail("失败");
        }



    }
}
