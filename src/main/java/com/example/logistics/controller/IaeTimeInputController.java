package com.example.logistics.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.example.logistics.model.IaeDeparture;
import com.example.logistics.model.IaeLineresource;
import com.example.logistics.service.IaeTimeinputService;
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
public class IaeTimeInputController {
    @Autowired
    private IaeTimeinputService iaeTimeinputService;

    @Autowired
    private ObjectJson objectJson;

    @RequestMapping("/queryIaeTimeinput")
    public void queryIaeTimeinput(HttpServletRequest request, HttpServletResponse response) throws Exception{
        int pages=Integer.parseInt(request.getParameter("page"));
        int count=Integer.parseInt(request.getParameter("limit"));

        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        System.out.println("进了");
        // 分页查询，并按照ID降序
        PageHelper.startPage(pages, count);
        List<IaeLineresource> list = iaeTimeinputService.queryIaeTimeinput((pages - 1) * count, count);
        Integer num = iaeTimeinputService.pagecount();
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

    @RequestMapping("/daodasjlr")
    public ModelAndView daodasjlr() throws Exception{
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/portEntryManagement/arrivalTimeInput.html");
        return mv;
    }
}
