package com.example.logistics.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.logistics.model.SorPackagedetails;
import com.example.logistics.service.SorPackagedetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class SorPackagedetailsController {

    @Autowired
    private SorPackagedetailsService sorPackagedetailsService;

    @RequestMapping("/addSorPackagedetails")
    public void  addSorPackagedetails(HttpServletRequest request, HttpServletResponse response) throws Exception{
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        // 获取前台传递的Json对象
        String formDate = request.getParameter("formDate");
        SorPackagedetails sorPackagedetails = JSONObject.parseObject(formDate, SorPackagedetails.class);
        int a = sorPackagedetailsService.addSorPackagedetails(sorPackagedetails);
        if (a > 0) {
            response.getWriter().write("success");
        } else {
            response.getWriter().write("error");
        }
    }

}
