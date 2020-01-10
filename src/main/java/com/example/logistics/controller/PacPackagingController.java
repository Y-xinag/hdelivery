package com.example.logistics.controller;

import com.example.logistics.model.PacPackaging;
import com.example.logistics.service.PacPackagingService;
import com.example.logistics.util.ObjectJson;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PacPackagingController {
    @Autowired
    private PacPackagingService pacPackagingService;

    @Autowired
    private ObjectJson objectJson;

    @RequestMapping("/pmm1")
    public ModelAndView packingMaterialManagement1(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("pages/packagingMaterialManagement/packagingMaterialManagement");
        return mav;
    }

    @RequestMapping("/pmm2")
    public ModelAndView packingMaterialManagement2(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("pages/packagingMaterialManagement/warehousingManagement.html");
        return mav;
    }

    @RequestMapping("/pmm3")
    public ModelAndView packingMaterialManagement3(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("pages/packagingMaterialManagement/outboundManagement.html");
        return mav;
    }

    @RequestMapping("/pmm4")
    public ModelAndView packingMaterialManagement4(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("pages/packagingMaterialManagement/inventoryManagement.html");
        return mav;
    }

    @RequestMapping("/initialization1")
    @ResponseBody
    public ObjectJson initialization(){
        //Page<Object> page = PageHelper.startPage(1, 10);
        List<PacPackaging> fin = pacPackagingService.fin();
        objectJson.setCode(0);
        //objectJson.setCount((int)page.getTotal());
        objectJson.setMsg("");
        objectJson.setData(fin);
        return objectJson;
    }

    @RequestMapping("/query")
    public ModelAndView query(){
        ModelAndView mav = new ModelAndView();

        return mav;
    }

    @RequestMapping("/padd")
    public ModelAndView padd(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("pages/packagingMaterialManagement/packagingMaterialManagement_add");
        return mav;
    }
}
