package com.example.logistics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IaeArrivalController {
    @RequestMapping("/jingangfd")
    public ModelAndView jingangfd() throws Exception{
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/portEntryManagement/entryOrder.html");
        return mv;
    }
}
