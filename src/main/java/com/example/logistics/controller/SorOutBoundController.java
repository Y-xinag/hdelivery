package com.example.logistics.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.example.logistics.helperentity.SorOutboundEntity;
import com.example.logistics.model.SorOutbound;
import com.example.logistics.model.SorStorage;
import com.example.logistics.model.SorStoragedetails;
import com.example.logistics.model.SyEmp;
import com.example.logistics.service.SorOutboundService;
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
public class SorOutBoundController {

    @Autowired
    private SorOutboundService sorOutboundService;

    @Autowired
    private ObjectJson objectJson;

    @RequestMapping("/addSorOutbound")
    public void  addSorOutbound(HttpServletRequest request, HttpServletResponse response) throws Exception{
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        // 获取前台传递的Json对象
        String formData = request.getParameter("formData");
        SorOutbound sorOutbound = JSONObject.parseObject(formData, SorOutbound.class);
        int a = sorOutboundService.addSorOutbound(sorOutbound);

        if (a > 0) {
            response.getWriter().write("success");
        } else {
            response.getWriter().write("error");
        }
    }




    @RequestMapping("/querySorOutbound")
    public void querySorOutbound(HttpServletRequest request, HttpServletResponse response) throws Exception {
        int pages=Integer.parseInt(request.getParameter("page"));
        int count=Integer.parseInt(request.getParameter("limit"));

        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        PageHelper.startPage(pages, count);
        List<SorOutbound> sorOutboundslist = sorOutboundService.querySorOutbound((pages - 1) * count, count);
        List list=new ArrayList<SorOutboundEntity>();
        for (SorOutbound sorOutbound : sorOutboundslist) {
            SorOutboundEntity sorOutboundEntity = new SorOutboundEntity();

            sorOutboundEntity.setOutboundid(sorOutbound.getOutboundid());
            sorOutboundEntity.setHandovertype(sorOutbound.getHandovertype());
            sorOutboundEntity.setLine(sorOutbound.getLine());
            sorOutboundEntity.setDirection(sorOutbound.getDirection());
            sorOutboundEntity.setCarriers(sorOutbound.getCarriers());
            sorOutboundEntity.setDeliverycompany(sorOutbound.getDeliverycompany());
            sorOutboundEntity.setDeliverydate(sorOutbound.getDeliverydate());
            sorOutboundEntity.setEnterdate(sorOutbound.getEnterdate());
            for (SyEmp syEmp : sorOutbound.getSyEmpList()) {
                sorOutboundEntity.setDeliveryperson(syEmp.getEmpname());
                sorOutboundEntity.setAcceptperson(syEmp.getEmpname());
                sorOutboundEntity.setEnterperson(syEmp.getEmpname());
            }

            list.add(sorOutboundEntity);
        }

        Integer num = sorOutboundService.pagecount();
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
