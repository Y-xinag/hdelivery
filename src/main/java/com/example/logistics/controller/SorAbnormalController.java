package com.example.logistics.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.example.logistics.model.SorAbnormal;
import com.example.logistics.model.SorCheckbounddetails;
import com.example.logistics.model.SorOutbounddetails;
import com.example.logistics.service.SorAbnormalService;
import com.example.logistics.util.ObjectJson;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.List;

@Controller
public class SorAbnormalController {

    @Autowired
    private SorAbnormalService sorAbnormalService;

    @Autowired
    private ObjectJson objectJson;


    @RequestMapping("/addSorAbnormal")
    public void  addSorAbnormal(HttpServletRequest request, HttpServletResponse response) throws Exception{
        System.out.println("addSorAbnormal进了");
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        // 获取前台传递的Json对象
        String formData = request.getParameter("formData");
        SorAbnormal sorAbnormal = JSONObject.parseObject(formData, SorAbnormal.class);
        int a = sorAbnormalService.addSorAbnormal(sorAbnormal);

        if (a > 0) {
            response.getWriter().write("success");
        } else {
            response.getWriter().write("error");
        }
    }

    @RequestMapping("/querySorAbnormal")
    public void querySorAbnormal(HttpServletRequest request, HttpServletResponse response) throws Exception{
        int pages=Integer.parseInt(request.getParameter("page"));
        int count=Integer.parseInt(request.getParameter("limit"));

        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        // 分页查询，并按照ID降序
        PageHelper.startPage(pages, count);
        List<SorAbnormal> list = sorAbnormalService.querySorAbnormal((pages - 1) * count, count);
        Integer num =sorAbnormalService .pagecount();
        if (list.size()>0){
            objectJson.setCode(0);
            objectJson.setData(list);
            objectJson.setCount(num);
            objectJson.setMsg("");
            String jsonString = JSON.toJSONString(objectJson, SerializerFeature.DisableCircularReferenceDetect);
            PrintWriter out = response.getWriter();
            out.write(jsonString);
            System.out.println(jsonString);
        }
    }


    @RequestMapping("/ycadd")
    public ModelAndView ycadd() throws Exception{
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/sortingManagement/ExceptionRecord_add.html");
        return mv;
    }

    @RequestMapping("/danhuoyc")
    public ModelAndView danhuoyc() throws Exception{
        System.out.println("进了");
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/sortingManagement/singleCargoExceptionMonitoring.html");
        return mv;
    }
}
