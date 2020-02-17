package com.example.logistics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SorPackageController {
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
