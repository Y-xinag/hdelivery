package com.example.logistics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PacPackagingController {

    @RequestMapping("/aa")
    public ModelAndView aa(){
        ModelAndView mav = new ModelAndView();
        System.out.println("进入方法");
        mav.setViewName("pages/main");
        return mav;
    }
}
