package com.example.logistics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IaeExtractController {
    @RequestMapping("/tihuogl")
    public ModelAndView tihuogl() throws Exception{
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/portEntryManagement/deliveryManagement.html");
        return mv;
    }
}
