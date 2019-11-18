package com.saka947.demo.controller;

import com.saka947.demo.model.Grade;
import com.saka947.demo.model.Student;
import com.saka947.demo.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Controller
@RequestMapping("/grade")
public class GradeController extends BaseController {
    @Autowired
    private GradeService gradeService;

    private static Logger logger = Logger.getLogger(GradeController.class.toString());

    @RequestMapping(value = "/getGrade.ajax",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getGrade(@RequestBody Grade grade) {
        try {
            List<Grade> list = gradeService.getGradesByProperties(grade);
            return super.success(list);
        }catch (Exception e){
            logger.info("查询出错，message："+e.getMessage());
            return super.fail("失败");
        }
    }

    @RequestMapping(value = "/addOrUpdateGrade.ajax",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> addGrade(@RequestBody Grade grade) {
        try {
            int count = gradeService.insertOrUpdateGrade(grade);
            if (count>0){
                return super.success("成功");
            }
            return super.fail("失败");
        }catch (Exception e){
            logger.info("查询出错，message："+e.getMessage());
            return super.fail("失败");
        }
    }

    @RequestMapping(value = "/deleteGrade.ajax",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> delGrade(@RequestBody Grade grade) {
        try {
            int count = gradeService.deleteGrade(grade.getGradeId());
            if (count>0){
                return super.success("删除成功");
            }
            return super.fail("删除失败");
        }catch (Exception e){
            logger.info("删除出错，message："+e.getMessage());
            return super.fail("失败");
        }
    }
}
