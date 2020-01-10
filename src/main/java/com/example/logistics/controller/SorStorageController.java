package com.example.logistics.controller;

import com.example.logistics.model.SorStorage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SorStorageController {

    @RequestMapping("addSorStorage")
    public void addSorStorage(SorStorage sorStorage){

    }

    @RequestMapping("/query2")
    public ModelAndView query2() throws Exception{
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/sortingManagement/storage.html");
        return mv;
    }
    @RequestMapping("/query3")
    public ModelAndView query3() throws Exception{
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/sortingManagement/storage_add.html");
        return mv;
    }
    @RequestMapping("/query4")
    public ModelAndView query4() throws Exception{
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/sortingManagement/ExceptionRecord_add.html");
        return mv;
    }
    @RequestMapping("/query5")
    public ModelAndView query5() throws Exception{
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/sortingManagement/storage_list.html");
        return mv;
    }
}
