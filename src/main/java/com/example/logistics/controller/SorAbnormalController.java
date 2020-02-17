package com.example.logistics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SorAbnormalController {
    @RequestMapping("/danhuoyc")
    public ModelAndView danhuoyc() throws Exception{
        System.out.println("进了");
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/sortingManagement/singleCargoExceptionMonitoring.html");
        return mv;
    }
}
