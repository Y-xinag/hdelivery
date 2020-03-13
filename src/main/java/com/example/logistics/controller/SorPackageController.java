package com.example.logistics.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.logistics.model.SorOutbound;
import com.example.logistics.model.SorOutbounddetails;
import com.example.logistics.model.SorPackage;
import com.example.logistics.service.SorPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class SorPackageController {

    @Autowired
    private SorPackageService sorPackageService;

    @RequestMapping("/addSorPackage")
    public void  addSorPackage(HttpServletRequest request, HttpServletResponse response) throws Exception{
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        // 获取前台传递的Json对象
        String formData = request.getParameter("formData");
        SorPackage sorPackage = JSONObject.parseObject(formData, SorPackage.class);
        int a = sorPackageService.addSorPackage(sorPackage);
        if (a > 0) {
            response.getWriter().write("success");
        } else {
            response.getWriter().write("error");
        }
    }
    
    
    @RequestMapping("/hebao")
    public ModelAndView hebao() throws Exception{
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/sortingManagement/package.html");
        return mv;
    }

    @RequestMapping("/chaibao")
    public ModelAndView chaibao() throws Exception{
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/sortingManagement/unpacking.html");
        return mv;
    }

    @RequestMapping("/hebaocx")
    public ModelAndView hebaocx() throws Exception{
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/sortingManagement/packageQuery.html");
        return mv;
    }
}
