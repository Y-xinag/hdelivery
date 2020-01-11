package com.example.logistics.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.example.logistics.helperentity.SoStroageEntity;
import com.example.logistics.model.SorStorage;
import com.example.logistics.model.SyEmp;
import com.example.logistics.service.SorStroageService;
import com.example.logistics.util.ObjectJson;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@Controller
public class SorStorageController {
    @Autowired
    private SorStroageService sorStroageService;

    @Autowired
    private ObjectJson objectJson;




    @RequestMapping("/querySorStroage")
    public void querySorStroage(HttpServletRequest request, HttpServletResponse response) throws Exception {
        int pages=Integer.parseInt(request.getParameter("page"));
        int count=Integer.parseInt(request.getParameter("limit"));

        System.out.println(pages);
        System.out.println(count);
        System.out.println("_______________________");

        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        // 分页查询，并按照ID降序
        PageHelper.startPage(pages, count);
        List<SorStorage> sorStorageList=sorStroageService.querySorStorage((pages-1)*count,count);
        List list=new ArrayList<SoStroageEntity>();
        for (SorStorage sorStorage : sorStorageList) {
            SoStroageEntity soStroageEntity=new SoStroageEntity();
            soStroageEntity.setSid(sorStorage.getSid());
            soStroageEntity.setId(sorStorage.getId());
            soStroageEntity.setAcceptdate(sorStorage.getAcceptdate());
            soStroageEntity.setAcceptcompany(sorStorage.getAcceptcompany());
            soStroageEntity.setDeliverycompany(sorStorage.getDeliverycompany());
            for (SyEmp syEmp : sorStorage.getSyEmpList()) {
                soStroageEntity.setAcceptperson(syEmp.getEmpname());
                soStroageEntity.setDeliveryperson(syEmp.getEmpname());
            }
            list.add(soStroageEntity);
        }

        Integer num=sorStroageService.pagecount();
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


    @RequestMapping("addSorStorage")
    public void addSorStorage(SorStorage sorStorage){

    }

    @RequestMapping("/query2")
    public ModelAndView query2() throws Exception{
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/sortingManagement/storage.html");
        return mv;
    }
    @RequestMapping("/query3")
    public ModelAndView query3() throws Exception{
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/sortingManagement/storage_add.html");
        return mv;
    }
    @RequestMapping("/query4")
    public ModelAndView query4() throws Exception{
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/sortingManagement/ExceptionRecord_add.html");
        return mv;
    }
    @RequestMapping("/query5")
    public ModelAndView query5() throws Exception{
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/sortingManagement/storage_list.html");
        return mv;
    }
}
