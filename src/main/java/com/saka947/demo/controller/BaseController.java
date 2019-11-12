package com.saka947.demo.controller;

import java.util.HashMap;
import java.util.Map;

public class BaseController  {
    public BaseController() {

    }

    protected <T> Map<String, Object> success(T data) {
        Map<String, Object> modelMap = new HashMap(2);
        modelMap.put("data", data);
        modelMap.put("success", true);
        return modelMap;
    }

    protected Map<String, Object> fail(String message) {
        Map<String, Object> modelMap = new HashMap(2);
        modelMap.put("message", message);
        modelMap.put("success", false);
        return modelMap;
    }


    protected Map<String, Object> fail(String code, String message) {
        Map<String, Object> modelMap = new HashMap(2);
        modelMap.put("code", code);
        modelMap.put("message", message);
        modelMap.put("success", false);
        return modelMap;
    }
}
