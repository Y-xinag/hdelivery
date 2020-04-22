package com.example.logistics.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.example.logistics.helperentity.IaeArrivalEntity;
import com.example.logistics.model.IaeArrival;
import com.example.logistics.model.IaeLineresource;
import com.example.logistics.service.IaeArrivalService;
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
public class IaeArrivalController {

    @Autowired
    private IaeArrivalService iaeArrivalService;

    @Autowired
    private ObjectJson objectJson;

    @RequestMapping("/queryIaeArrival")
    public void queryIaeArrival(HttpServletRequest request, HttpServletResponse response) throws Exception{
        int pages=Integer.parseInt(request.getParameter("page"));
        int count=Integer.parseInt(request.getParameter("limit"));

        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        // 分页查询，并按照ID降序
        PageHelper.startPage(pages, count);
        List<IaeArrival> list = iaeArrivalService.queryIaeArrival((pages - 1) * count, count);
        Integer num = iaeArrivalService.pagecount();
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

    @RequestMapping("/jingangfd")
    public ModelAndView jingangfd() throws Exception{
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/portEntryManagement/entryOrder.html");
        return mv;
    }

    @RequestMapping("/queryIaeArrivalNo")
    public void queryIaeArrivalNo(HttpServletRequest request, HttpServletResponse response) throws Exception{
        int pages = Integer.parseInt(request.getParameter("page"));
        int count = Integer.parseInt(request.getParameter("limit"));

        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        // 分页查询，并按照ID降序
        PageHelper.startPage(pages, count);
        List<IaeArrival> iaeArrivals = iaeArrivalService.queryIaeArrivalNo((pages - 1) * count, count);
        List list = new ArrayList<IaeArrivalEntity>();
        for (IaeArrival iaeArrival : iaeArrivals) {
            IaeArrivalEntity iaeArrivalEntity = new IaeArrivalEntity();
            iaeArrivalEntity.setId(iaeArrival.getId());
            iaeArrivalEntity.setSendcompany(iaeArrival.getSendcompany());
            iaeArrivalEntity.setCargoaddress(iaeArrival.getCargoaddress());
            iaeArrivalEntity.setStoragedate(iaeArrival.getStoragedate());
            iaeArrivalEntity.setTimelimit(iaeArrival.getTimelimit());
            iaeArrivalEntity.setBatch(iaeArrival.getBatch());
            for (IaeLineresource iaeLineresource : iaeArrival.getIaeLineresourceList()) {
                iaeArrivalEntity.setAbnormalremarks(iaeLineresource.getAbnormalremarks());
                iaeArrivalEntity.setCarrier(iaeLineresource.getCarrier());
                iaeArrivalEntity.setAcceptcompany(iaeLineresource.getAcceptcompany());
            }
            list.add(iaeArrivalEntity);
        }
        Integer num = iaeArrivalService.pagecount();
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

}
