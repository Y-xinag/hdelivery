package com.example.logistics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @RequestMapping("/query1")
    public ModelAndView query() throws Exception {
        System.out.println("2020");
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/main");
        return mv;
    }
}
