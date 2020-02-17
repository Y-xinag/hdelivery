package com.example.logistics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IaeDepartureController {
    @RequestMapping("/chugangpz")
    public ModelAndView chugangpz() throws Exception{
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/portEntryManagement/departureStowage.html");
        return mv;
    }

    @RequestMapping("/chugangpzcx")
    public ModelAndView chugangpzcx() throws Exception{
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/portEntryManagement/departureStowageQuery.html");
        return mv;
    }
}
