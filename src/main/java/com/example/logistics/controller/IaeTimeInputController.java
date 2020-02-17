package com.example.logistics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IaeTimeInputController {
    @RequestMapping("/daodasjlr")
    public ModelAndView daodasjlr() throws Exception{
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/portEntryManagement/arrivalTimeInput.html");
        return mv;
    }
}
