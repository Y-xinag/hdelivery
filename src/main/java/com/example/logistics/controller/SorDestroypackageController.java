package com.example.logistics.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.logistics.model.SorDestroypackage;
import com.example.logistics.model.SorPackage;
import com.example.logistics.service.SorDestroypackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class SorDestroypackageController {

    @Autowired
    private SorDestroypackageService sorDestroypackageService;

    @RequestMapping("/addSorDestroypackage")
    public void  addSorDestroypackage(HttpServletRequest request, HttpServletResponse response) throws Exception{
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        // 获取前台传递的Json对象
        String formData = request.getParameter("formData");
        SorDestroypackage sorDestroypackage = JSONObject.parseObject(formData, SorDestroypackage.class);
        int a = sorDestroypackageService.addSorDestroypackage(sorDestroypackage);
        if (a > 0) {
            response.getWriter().write("success");
        } else {
            response.getWriter().write("error");
        }
    }
    
}
