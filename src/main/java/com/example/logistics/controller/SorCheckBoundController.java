package com.example.logistics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SorCheckBoundController {
    @RequestMapping("/panku")
    public ModelAndView panku() throws Exception{
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/sortingManagement/check.html");
        return mv;
    }
    @RequestMapping("/pankuadd")
    public ModelAndView pankuadd() throws Exception{
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/sortingManagement/invoiceComparisonTable_add.html");
        return mv;
    }
    @RequestMapping("/pankuedit")
    public ModelAndView pankuedit() throws Exception{
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/sortingManagement/invoiceComparisonTable_add.html");
        return mv;
    }
    @RequestMapping("/pankuselect")
    public ModelAndView pankuselect() throws Exception{
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/sortingManagement/check_list.html");
        return mv;
    }
}
