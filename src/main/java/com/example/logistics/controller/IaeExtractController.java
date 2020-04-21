package com.example.logistics.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.example.logistics.model.IaeDeparture;
import com.example.logistics.model.IaeExtract;
import com.example.logistics.service.IaeExtractService;
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
public class IaeExtractController {

    @Autowired
    private IaeExtractService iaeExtractService;

    @Autowired
    private ObjectJson objectJson;

    @RequestMapping("/queryIaeExtract")
    public void queryIaeExtract(HttpServletRequest request, HttpServletResponse response) throws Exception{
        int pages=Integer.parseInt(request.getParameter("page"));
        int count=Integer.parseInt(request.getParameter("limit"));

        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        // 分页查询，并按照ID降序
        PageHelper.startPage(pages, count);
        List<IaeExtract> list = iaeExtractService.queryIaeExtract((pages - 1) * count, count);
        Integer num = iaeExtractService.pagecount();
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


    @RequestMapping("/tihuogl")
    public ModelAndView tihuogl() throws Exception{
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/portEntryManagement/deliveryManagement.html");
        return mv;
    }
}
