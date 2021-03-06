package com.example.logistics.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.example.logistics.helperentity.SorOutboundEntity;
import com.example.logistics.model.*;
import com.example.logistics.service.SorOutboundService;
import com.example.logistics.service.SorOutbounddetailsService;
import com.example.logistics.util.ObjectJson;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
    private SorOutbounddetailsService sorOutbounddetailsService;
    @Autowired
    private ObjectJson objectJson;

    @RequestMapping("/delSorOutbound")
    public void delSorOutbound(HttpServletRequest request, HttpServletResponse response) throws Exception{
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("UTF-8");

        String outboundid = request.getParameter("outboundid");
        int i = sorOutboundService.delSorOutbound(outboundid);
        if (i>0){
            response.getWriter().write("success");
        }else {
            response.getWriter().write("error");
        }
    }

    @RequestMapping("/queryByoutId")
    public void queryByoutId(HttpServletRequest request, HttpServletResponse response) throws  Exception{
        System.out.println("进了");
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("UTF-8");

        // 获取前台传递的参数
        String outboundid = request.getParameter("outboundid");
        System.out.println("outboundid="+outboundid);
        if (outboundid!=null){
            System.out.println("进来了");
            SorOutbound sorOutbound = sorOutboundService.queryById(outboundid);
            // 判断返回的person对象是否为空
            // 使用JSON转换格式
            String jsonString = JSON.toJSONString(sorOutbound,SerializerFeature.DisableCircularReferenceDetect);
            System.out.println(jsonString);
            response.getWriter().write(jsonString);
        }

    }

    @RequestMapping("/updateSorOutbound")
    public void updateSorOutbound(HttpServletRequest request, HttpServletResponse response) throws Exception{
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("UTF-8");

        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        // 获取前台传递的Json对象
        String formData = request.getParameter("formData");

        // 将json字符串转换为对象
        SorOutbound sorOutbound = JSONObject.parseObject(formData, SorOutbound.class);
        int a = sorOutboundService.updateSorOutbound(sorOutbound);
        // 根据返回结果进行不同的处理
        if (a > 0) {
            response.getWriter().write("success");
        } else {
            response.getWriter().write("error");
        }
    }

    @RequestMapping("/addSorOutbound")
    public void  addSorOutbound(HttpServletRequest request, HttpServletResponse response) throws Exception{
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        // 获取前台传递的Json对象
        String formData = request.getParameter("formData");
        SorOutbound sorOutbound = JSONObject.parseObject(formData, SorOutbound.class);
        int a = sorOutboundService.addSorOutbound(sorOutbound);

        if (a > 0) {
            SorOutbounddetails sorOutbounddetails = JSONObject.parseObject(formData, SorOutbounddetails.class);
            sorOutbounddetailsService.addSorOutbounddetails(sorOutbounddetails);
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

    @RequestMapping("/rukuupdate/{a}")
    public ModelAndView rukuupdate(@PathVariable("a") String outboundid) throws Exception{
        System.out.println(outboundid);
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/sortingManagement/theLibrary_edit.html");
        mv.addObject("outboundid",outboundid);
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
