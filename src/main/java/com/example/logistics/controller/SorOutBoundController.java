package com.example.logistics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SorOutBoundController {

    @RequestMapping("/ruku")
    public ModelAndView ruku() throws Exception{
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/sortingManagement/theLibrary.html");
        return mv;
    }

    @RequestMapping("/rukuadd")
    public ModelAndView rukuadd() throws Exception{
        System.out.println("进了");
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/sortingManagement/theLibrary_add.html");
        return mv;
    }

    @RequestMapping("/rukuselect")
    public ModelAndView rukuselect() throws Exception{
        System.out.println("进了");
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/sortingManagement/theLibrary_list.html");
        return mv;
    }

    @RequestMapping("/rukuupdate")
    public ModelAndView rukuupdate() throws Exception{
        System.out.println("进了");
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/sortingManagement/theLibrary_edit.html");
        return mv;
    }

    @RequestMapping("/kucuncx")
    public ModelAndView kucuncx() throws Exception{
        System.out.println("进了");
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/sortingManagement/stockQuery.html");
        return mv;
    }


}
