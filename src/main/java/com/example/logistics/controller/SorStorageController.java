package com.example.logistics.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.example.logistics.helperentity.SoStroageEntity;
import com.example.logistics.model.SorStorage;
import com.example.logistics.model.SorStoragedetails;
import com.example.logistics.model.SyEmp;
import com.example.logistics.service.SorStoragedetailsService;
import com.example.logistics.service.SorStroageService;
import com.example.logistics.util.ObjectJson;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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

    @Autowired
    private SorStoragedetailsService sorStoragedetailsService;

    @RequestMapping("/delSorStorage")
    public void delSorStorage(HttpServletRequest request, HttpServletResponse response) throws Exception{
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("UTF-8");

        String sid = request.getParameter("sid");
        int i = sorStroageService.delSorStorage(Integer.parseInt(sid));
        if (i>0){
            response.getWriter().write("success");
        }else {
            response.getWriter().write("error");
        }
    }

    @RequestMapping("/queryById")
    public void queryById(HttpServletRequest request, HttpServletResponse response) throws  Exception{
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("UTF-8");

        // 获取前台传递的参数
        String sid = request.getParameter("sid");
        System.out.println("sid="+sid);
        if (sid!=null){
            System.out.println("进来了");
            SorStorage sorStorage = sorStroageService.queryById(Integer.parseInt(sid));
            // 判断返回的person对象是否为空
            // 使用JSON转换格式
            String jsonString = JSON.toJSONString(sorStorage,SerializerFeature.DisableCircularReferenceDetect);
            System.out.println(jsonString);
            response.getWriter().write(jsonString);
        }

    }

    @RequestMapping("/updateSorStorage")
    public void updateSorStorage(HttpServletRequest request, HttpServletResponse response) throws Exception{
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("UTF-8");

        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        // 获取前台传递的Json对象
        String formData = request.getParameter("formData");

        // 将json字符串转换为对象
        SorStorage sorStorage = JSONObject.parseObject(formData, SorStorage.class);
        int a = sorStroageService.updateSorStorage(sorStorage);
        // 根据返回结果进行不同的处理
        if (a > 0) {
            response.getWriter().write("success");
        } else {
            response.getWriter().write("error");
        }
    }


    @RequestMapping("/addSorStorage")
    public void  addSorStorage(HttpServletRequest request, HttpServletResponse response) throws Exception{
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        // 获取前台传递的Json对象
        String formData = request.getParameter("formData");
        SorStorage sorStorage=JSONObject.parseObject(formData, SorStorage.class);
        int a = sorStroageService.addSorStorage(sorStorage);

        if (a > 0) {
            SorStoragedetails sorStoragedetails = JSONObject.parseObject(formData, SorStoragedetails.class);
            sorStoragedetailsService.addSorStoragedetails(sorStoragedetails);
            response.getWriter().write("success");
        } else {
            response.getWriter().write("error");
        }
    }


    @RequestMapping("/querySorStroage")
    public void querySorStroage(HttpServletRequest request, HttpServletResponse response) throws Exception {
        int pages=Integer.parseInt(request.getParameter("page"));
        int count=Integer.parseInt(request.getParameter("limit"));

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
            PrintWriter out = response.getWriter();
            out.write(jsonString);
        }


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
    @RequestMapping("/query4/{a}")
    public ModelAndView query4(@PathVariable("a") String sid) throws Exception{
        System.out.println(sid);

        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/sortingManagement/storage_edit.html");
        mv.addObject("sid",sid);
        return mv;
    }
    @RequestMapping("/query5")
    public ModelAndView query5() throws Exception{
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pages/sortingManagement/storage_list.html");
        return mv;
    }
}
