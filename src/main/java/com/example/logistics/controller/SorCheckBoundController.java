package com.example.logistics.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.example.logistics.helperentity.SorCheckboundEntity;
import com.example.logistics.model.SorCheckbound;
import com.example.logistics.model.SyEmp;
import com.example.logistics.service.SorCheckboundService;
import com.example.logistics.util.ObjectJson;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@Controller
public class SorCheckBoundController {
    @Autowired
    private SorCheckboundService sorCheckboundService;

    @Autowired
    private ObjectJson objectJson;

    @RequestMapping("/querySorCheckbound")
    public void querySorCheckbound(HttpServletRequest request, HttpServletResponse response) throws Exception {
        int pages=Integer.parseInt(request.getParameter("page"));
        int count=Integer.parseInt(request.getParameter("limit"));

        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        PageHelper.startPage(pages, count);
        List<SorCheckbound> sorCheckboundList = sorCheckboundService.querySorCheckbound((pages - 1) * count, count);
        List list = new ArrayList<SorCheckboundEntity>();
        for (SorCheckbound sorCheckbound : sorCheckboundList) {
            SorCheckboundEntity sorCheckboundEntity = new SorCheckboundEntity();
            sorCheckboundEntity.setCid(sorCheckbound.getCid());
            sorCheckboundEntity.setScanid(sorCheckbound.getScanid());
            sorCheckboundEntity.setCargosum(sorCheckbound.getCargosum());
            sorCheckboundEntity.setCheckdate(sorCheckbound.getCheckdate());
            sorCheckboundEntity.setCheckcompany(sorCheckbound.getCheckcompany());
            for (SyEmp syEmp : sorCheckbound.getSyEmpList()) {
                sorCheckboundEntity.setCheckperson(syEmp.getEmpname());
            }

            list.add(sorCheckboundEntity);
        }
        Integer num = sorCheckboundService.pagecount();
        if (list.size()>0){
            objectJson.setCode(0);
            objectJson.setData(list);
            objectJson.setCount(num);
            objectJson.setMsg("");
            String jsonString = JSON.toJSONString(objectJson, SerializerFeature.DisableCircularReferenceDetect);
            System.out.println(jsonString);
            PrintWriter out = response.getWriter();
            out.write(jsonString);
        }
    }


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
