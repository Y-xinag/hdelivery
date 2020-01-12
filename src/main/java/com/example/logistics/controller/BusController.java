package com.example.logistics.controller;


import com.example.logistics.model.AccBusinessAdmissibility;
import com.example.logistics.model.Bus1Result;
import com.example.logistics.service.BusService;
import com.example.logistics.service.impl.BusServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class BusController {
    //引入service层
    @Autowired
    private BusService busService;
    @RequestMapping("/bus1")
    public ModelAndView bus1(Model model) throws Exception{
        //Map<Integer,Bus1Result> map=busService.findAll();
        List<AccBusinessAdmissibility> list=busService.testQuery();
        System.out.printf(list.get(0)+"");
        model.addAttribute("list",list);
        ModelAndView mav=new ModelAndView();
        mav.setViewName("pages/acceptance/businessAcceptance");
        return  mav;
    }
    @RequestMapping("/bus1Add")
    public ModelAndView bus1Add() throws Exception{
        ModelAndView mav=new ModelAndView();
        mav.setViewName("pages/acceptance/businessAcceptance_add");
        return  mav;
    }

    @RequestMapping("/bus2")
    public ModelAndView bus2() throws Exception{
        ModelAndView mav=new ModelAndView();
        mav.setViewName("pages/acceptance/worksheetQuickInput");
        return  mav;
    }
    @RequestMapping("/bus3")
    public ModelAndView bus3() throws Exception{
        ModelAndView mav=new ModelAndView();
        mav.setViewName("pages/acceptance/worksheetQuery");
        return  mav;
    }
}
