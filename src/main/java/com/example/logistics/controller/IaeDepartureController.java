package com.example.logistics.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.example.logistics.helperentity.IaeDepartureEntity;
import com.example.logistics.helperentity.SorPackageEntity;
import com.example.logistics.model.IaeArrival;
import com.example.logistics.model.IaeDeparture;
import com.example.logistics.model.IaeExtract;
import com.example.logistics.model.IaeLineresource;
import com.example.logistics.service.IaeDepartureService;
import com.example.logistics.service.IaeLineresourceService;
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
public class IaeDepartureController {

    @Autowired
    private IaeDepartureService iaeDepartureService;

    @Autowired
    private IaeLineresourceService iaeLineresourceService;

    @Autowired
    private ObjectJson objectJson;

    @RequestMapping("/queryIaeDeparture")
    public void queryIaeDeparture(HttpServletRequest request, HttpServletResponse response) throws Exception{
        int pages=Integer.parseInt(request.getParameter("page"));
        int count=Integer.parseInt(request.getParameter("limit"));

        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        System.out.println("进了");
        // 分页查询，并按照ID降序
        PageHelper.startPage(pages, count);
        List<IaeDeparture> list = iaeDepartureService.queryIaeDeparture((pages - 1) * count, count);
        Integer num = iaeDepartureService.pagecount();
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

    @RequestMapping("/chugangpz")
    public ModelAndView chugangpz() throws Exception{
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/portEntryManagement/departureStowage.html");
        return mv;
    }


    @RequestMapping("/queryIaeLineresource")
    public void queryIaeLineresource(HttpServletRequest request, HttpServletResponse response) throws Exception{
        int pages=Integer.parseInt(request.getParameter("page"));
        int count=Integer.parseInt(request.getParameter("limit"));

        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        System.out.println("进了");
        // 分页查询，并按照ID降序
        PageHelper.startPage(pages, count);
        List<IaeLineresource> list = iaeLineresourceService.queryIaeLineresource((pages - 1) * count, count);
        Integer num = iaeLineresourceService.pagecount();
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

    @RequestMapping("/chugangpzcx")
    public ModelAndView chugangpzcx() throws Exception{
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/portEntryManagement/departureStowageQuery.html");
        return mv;
    }

    @RequestMapping("/queryIaejkAll")
    public void queryIaejkAll(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("1111");
        int pages = Integer.parseInt(request.getParameter("page"));
        int count = Integer.parseInt(request.getParameter("limit"));

        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        // 分页查询，并按照ID降序
        PageHelper.startPage(pages, count);
        List<IaeDeparture> iaeDepartures = iaeDepartureService.queryIaejkAll((pages - 1) * count, count);
        List list = new ArrayList<IaeDepartureEntity>();
        for (IaeDeparture iaeDeparture : iaeDepartures) {
            IaeDepartureEntity iaeDepartureEntity = new IaeDepartureEntity();
            iaeDepartureEntity.setId(iaeDeparture.getId());
            iaeDepartureEntity.setPackingid(iaeDeparture.getPackingid());
            for (IaeArrival iaeArrival : iaeDeparture.getIaeArrivalList()) {
                iaeDepartureEntity.setStoragedate(iaeArrival.getStoragedate());
                iaeDepartureEntity.setSendcompany(iaeArrival.getSendcompany());
                iaeDepartureEntity.setIssueperson(iaeArrival.getIssueperson());
            }
            for (IaeLineresource iaeLineresource : iaeDeparture.getIaeLineresourceList()) {
                iaeDepartureEntity.setWaybillid(iaeLineresource.getWaybillid());
                iaeDepartureEntity.setVehicleint(iaeLineresource.getVehicleint());
                iaeDepartureEntity.setExpectarrivaldate(iaeLineresource.getExpectarrivaldate());
                iaeDepartureEntity.setAcceptdate(iaeLineresource.getAcceptdate());
                iaeDepartureEntity.setTakecargoperson(iaeLineresource.getTakecargoperson());
            }

            for (IaeExtract iaeExtract : iaeDeparture.getIaeExtractList()) {
                iaeDepartureEntity.setOutplace(iaeExtract.getId());
                iaeDepartureEntity.setTransportway(iaeExtract.getTransportway());
            }
            list.add(iaeDepartureEntity);
            System.out.println(iaeDepartureEntity.getTransportway()+"11111111");
        }
        Integer num = iaeDepartureService.pagecount();
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
