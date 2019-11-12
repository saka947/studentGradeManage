package com.saka947.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class CommonController extends BaseController{

    @RequestMapping(value = "/pageQuery.ajax")
    @ResponseBody
    public Map<String, Object> test() {
         return super.success("成功");
    }
}
