package com.example.logistics.controller;

import com.example.logistics.model.SorStorage;
import com.example.logistics.model.SyEmp;
import com.example.logistics.service.SorStroageService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SorStorageController {
    @Autowired
    private SorStroageService sorStroageService;


    @RequestMapping("/querySorStroage")
    public ModelAndView querySorStroage(@RequestParam(defaultValue = "0", value = "page") Integer page, @RequestParam(defaultValue = "3", value = "size") Integer size, @RequestParam(value = "meg", defaultValue = "") String meg) throws Exception {
        // 分页查询，并按照ID降序
        PageHelper.startPage(page, size, "sid desc");
        List<SorStorage> sorStorageList=sorStroageService.querySorStorage();
        List list=new ArrayList<>();
        for (SorStorage sorStorage : sorStorageList) {
            list.add(sorStorage.getSid());
            list.add(sorStorage.getId());
            list.add(sorStorage.getAcceptdate());
            list.add(sorStorage.getAcceptcompany());
            list.add(sorStorage.getDeliverycompany());
            for (SyEmp syEmp : sorStorage.getSyEmpList()) {
                list.add(syEmp.getEmpname());
            }
        }

        ////将集合放入SorStorage对象
        PageInfo<SorStorage> pageInfo = new PageInfo<>(sorStorageList);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("page", pageInfo);
        modelAndView.addObject("meg", meg);
        modelAndView.setViewName("index");

        return modelAndView;
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
