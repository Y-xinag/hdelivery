package com.example.logistics.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.example.logistics.helperentity.SorCheckbounddetailsEntity;
import com.example.logistics.model.SorCheckbounddetails;
import com.example.logistics.model.SyEmp;
import com.example.logistics.service.SorCheckbounddetailsService;
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
public class SorCheckbounddetailsController {
    @Autowired
    private SorCheckbounddetailsService sorCheckbounddetailsService;

    @Autowired
    private ObjectJson objectJson;

    @RequestMapping("/delSorCheckbounddetails")
    public void delSorCheckbounddetails(HttpServletRequest request, HttpServletResponse response) throws Exception{
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("UTF-8");

        String id = request.getParameter("id");
        int i = sorCheckbounddetailsService.delSorCheckbounddetails(Integer.parseInt(id));
        if (i>0){
            response.getWriter().write("success");
        }else {
            response.getWriter().write("error");
        }
    }

    @RequestMapping("/queryByCdid")
    public void queryByCdid(HttpServletRequest request, HttpServletResponse response) throws  Exception{
        System.out.println("进了");
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("UTF-8");

        // 获取前台传递的参数
        String id = request.getParameter("id");
        System.out.println("id="+id);
        if (id!=null){
            System.out.println("进来了");
            SorCheckbounddetails sorCheckbounddetails = sorCheckbounddetailsService.queryBycdid(Integer.parseInt(id));
            // 判断返回的person对象是否为空
            // 使用JSON转换格式
            String jsonString = JSON.toJSONString(sorCheckbounddetails, SerializerFeature.DisableCircularReferenceDetect);
            System.out.println(jsonString);
            response.getWriter().write(jsonString);
        }

    }

    @RequestMapping("/updateSorCheckbounddetails")
    public void updateSorCheckbounddetails(HttpServletRequest request, HttpServletResponse response) throws Exception{
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("UTF-8");

        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        // 获取前台传递的Json对象
        String formData = request.getParameter("formData");

        // 将json字符串转换为对象
        SorCheckbounddetails sorCheckbounddetails = JSONObject.parseObject(formData, SorCheckbounddetails.class);
        int a =sorCheckbounddetailsService.updateSorCheckbounddetails(sorCheckbounddetails);
        // 根据返回结果进行不同的处理
        if (a > 0) {
            response.getWriter().write("success");
        } else {
            response.getWriter().write("error");
        }
    }

    @RequestMapping("/addSorCheckbounddetails")
    public void  addSorCheckbounddetails(HttpServletRequest request, HttpServletResponse response) throws Exception{
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        // 获取前台传递的Json对象
        String formData = request.getParameter("formData");
        SorCheckbounddetails sorCheckbounddetails = JSONObject.parseObject(formData, SorCheckbounddetails.class);
        int a = sorCheckbounddetailsService.addSorCheckbounddetails(sorCheckbounddetails);

        if (a > 0) {
            response.getWriter().write("success");
        } else {
            response.getWriter().write("error");
        }
    }

    @RequestMapping("/querySorCheckbounddetails")
    public void querySorCheckbounddetails(HttpServletRequest request, HttpServletResponse response) throws Exception {
        int pages=Integer.parseInt(request.getParameter("page"));
        int count=Integer.parseInt(request.getParameter("limit"));

        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        PageHelper.startPage(pages, count);
        List<SorCheckbounddetails> sorCheckbounddetailsList = sorCheckbounddetailsService.querySorCheckbounddetails((pages - 1) * count, count);
        List list = new ArrayList<SorCheckbounddetailsEntity>();
        for (SorCheckbounddetails sorCheckbounddetails : sorCheckbounddetailsList) {
            SorCheckbounddetailsEntity sorCheckbounddetailsEntity = new SorCheckbounddetailsEntity();
            sorCheckbounddetailsEntity.setId(sorCheckbounddetails.getId());
            sorCheckbounddetailsEntity.setPackageid(sorCheckbounddetails.getPackageid());
            sorCheckbounddetailsEntity.setCargocount(sorCheckbounddetails.getCargocount());
            sorCheckbounddetailsEntity.setCargotype(sorCheckbounddetails.getCargotype());
            sorCheckbounddetailsEntity.setDirection(sorCheckbounddetails.getDirection());
            sorCheckbounddetailsEntity.setVolume(sorCheckbounddetails.getVolume());
            sorCheckbounddetailsEntity.setWeight(sorCheckbounddetails.getWeight());
            sorCheckbounddetailsEntity.setStoragedate(sorCheckbounddetails.getStoragedate());
            for (SyEmp syEmp : sorCheckbounddetails.getSyEmpList()) {
                sorCheckbounddetailsEntity.setStorageperson(syEmp.getEmpname());
            }

            list.add(sorCheckbounddetailsEntity);
            System.out.println(sorCheckbounddetailsEntity.getStorageperson());
        }

        Integer num = sorCheckbounddetailsService.pagecount();
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

    @RequestMapping("/pankuxcadd")
    public ModelAndView pankuxcadd() throws Exception{
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/sortingManagement/basicArchives_detail_add.html");
        return mv;
    }
    @RequestMapping("/pankuxcedit/{a}")
    public ModelAndView pankuxcedit(@PathVariable("a") String id) throws Exception{
        System.out.println(id);
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/sortingManagement/basicArchives_detail_edit.html");
        mv.addObject("id",id);
        return mv;
    }
}
