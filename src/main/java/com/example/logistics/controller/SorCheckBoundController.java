package com.example.logistics.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.example.logistics.helperentity.SorCheckboundEntity;
import com.example.logistics.model.SorCheckbound;
import com.example.logistics.model.SorOutbound;
import com.example.logistics.model.SorOutbounddetails;
import com.example.logistics.model.SyEmp;
import com.example.logistics.service.SorCheckboundService;
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
public class SorCheckBoundController {
    @Autowired
    private SorCheckboundService sorCheckboundService;

    @Autowired
    private ObjectJson objectJson;

    @RequestMapping("/delSorCheckbound")
    public void delSorCheckbound(HttpServletRequest request, HttpServletResponse response) throws Exception{
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("UTF-8");

        String cid = request.getParameter("cid");
        int i = sorCheckboundService.delSorCheckbound(Integer.parseInt(cid));
        if (i>0){
            response.getWriter().write("success");
        }else {
            response.getWriter().write("error");
        }
    }

    @RequestMapping("/queryByCid")
    public void queryByCid(HttpServletRequest request, HttpServletResponse response) throws  Exception{
        System.out.println("进了");
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("UTF-8");

        // 获取前台传递的参数
        String cid = request.getParameter("cid");
        System.out.println("cid="+cid);
        if (cid!=null){
            System.out.println("进来了");
            SorCheckbound sorCheckbound = sorCheckboundService.queryByCid(Integer.parseInt(cid));
            // 判断返回的person对象是否为空
            // 使用JSON转换格式
            String jsonString = JSON.toJSONString(sorCheckbound,SerializerFeature.DisableCircularReferenceDetect);
            System.out.println(jsonString);
            response.getWriter().write(jsonString);
        }

    }

    @RequestMapping("/updateSorCheckbound")
    public void updateSorCheckbound(HttpServletRequest request, HttpServletResponse response) throws Exception{
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("UTF-8");

        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        // 获取前台传递的Json对象
        String formData = request.getParameter("formData");

        // 将json字符串转换为对象
        SorCheckbound sorCheckbound = JSONObject.parseObject(formData, SorCheckbound.class);
        int a =sorCheckboundService.updateSorCheckbound(sorCheckbound);
        // 根据返回结果进行不同的处理
        if (a > 0) {
            response.getWriter().write("success");
        } else {
            response.getWriter().write("error");
        }
    }

    @RequestMapping("/addSorCheckbound")
    public void  addSorCheckbound(HttpServletRequest request, HttpServletResponse response) throws Exception{
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        // 获取前台传递的Json对象
        String formData = request.getParameter("formData");
        SorCheckbound sorCheckbound = JSONObject.parseObject(formData, SorCheckbound.class);
        int a = sorCheckboundService.addSorCheckbound(sorCheckbound);

        if (a > 0) {
//            SorOutbounddetails sorOutbounddetails = JSONObject.parseObject(formData, SorOutbounddetails.class);
//            sorOutbounddetailsService.addSorOutbounddetails(sorOutbounddetails);
            response.getWriter().write("success");
        } else {
            response.getWriter().write("error");
        }
    }

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
    @RequestMapping("/pankuedit/{cid}")
    public ModelAndView pankuedit(@PathVariable("a") String cid) throws Exception{
        System.out.println(cid);
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/sortingManagement/invoiceComparisonTable_edit.html");
        mv.addObject("cid",cid);
        return mv;
    }
    @RequestMapping("/pankuselect")
    public ModelAndView pankuselect() throws Exception{
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/sortingManagement/check_list.html");
        return mv;
    }
}
