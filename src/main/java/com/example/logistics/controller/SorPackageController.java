package com.example.logistics.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.example.logistics.helperentity.SoStroageEntity;
import com.example.logistics.helperentity.SorPackageEntity;
import com.example.logistics.model.*;
import com.example.logistics.service.SorPackageService;
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
public class SorPackageController {

    @Autowired
    private SorPackageService sorPackageService;

    @Autowired
    private ObjectJson objectJson;

    @RequestMapping("/addSorPackage")
    public void  addSorPackage(HttpServletRequest request, HttpServletResponse response) throws Exception{
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        // 获取前台传递的Json对象
        String formData = request.getParameter("formData");
        SorPackage sorPackage = JSONObject.parseObject(formData, SorPackage.class);
        int a = sorPackageService.addSorPackage(sorPackage);
        if (a > 0) {
            response.getWriter().write("success");
        } else {
            response.getWriter().write("error");
        }
    }


    @RequestMapping("/queryAllpackage")
    public void queryAllpackage(HttpServletRequest request, HttpServletResponse response) throws Exception {
        int pages = Integer.parseInt(request.getParameter("page"));
        int count = Integer.parseInt(request.getParameter("limit"));

        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        // 分页查询，并按照ID降序
        PageHelper.startPage(pages, count);
        List<SorPackage> sorPackages = sorPackageService.queryAllpackage((pages - 1) * count, count);
        List list = new ArrayList<SorPackageEntity>();
        for (SorPackage sorPackage : sorPackages) {
            SorPackageEntity sorPackageEntity = new SorPackageEntity();
            sorPackageEntity.setId(sorPackage.getId());
            sorPackageEntity.setSealint(sorPackage.getSealint());
            sorPackageEntity.setDestination(sorPackage.getDestination());
            sorPackageEntity.setTimelimit(sorPackage.getTimelimit());
            for (SyEmp syEmp : sorPackage.getSyEmpList()) {
                sorPackageEntity.setEmpname(syEmp.getEmpname());
            }
            for (SorDestroypackage sorDestroypackage : sorPackage.getSorDestroypackageList()) {
                sorPackageEntity.setDestroyperson(sorDestroypackage.getDestroyperson());
                sorPackageEntity.setArriveplace(sorDestroypackage.getArriveplace());
            }
            list.add(sorPackageEntity);

        }

        Integer num=sorPackageService.pagecount();
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

    
    @RequestMapping("/hebao")
    public ModelAndView hebao() throws Exception{
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/sortingManagement/package.html");
        return mv;
    }

    @RequestMapping("/chaibao")
    public ModelAndView chaibao() throws Exception{
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/sortingManagement/unpacking.html");
        return mv;
    }

    @RequestMapping("/hebaocx")
    public ModelAndView hebaocx() throws Exception{
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/sortingManagement/packageQuery.html");
        return mv;
    }
}
