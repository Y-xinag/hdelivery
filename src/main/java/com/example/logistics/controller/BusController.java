package com.example.logistics.controller;


import com.example.logistics.model.AccBusinessAdmissibility;
import com.example.logistics.model.Bus1Result;
import com.example.logistics.service.BusService;
import com.example.logistics.service.impl.BusServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class BusController {
    //引入service层
    @Autowired
    private BusService busService;
    @RequestMapping("/bus1")
    public ModelAndView bus1(Model model) throws Exception{
        //Map<Integer,Bus1Result> map=busService.findAll();
        List<AccBusinessAdmissibility> list=busService.testQuery();
        System.out.printf(list.get(0)+"");
        model.addAttribute("list",list);
        ModelAndView mav=new ModelAndView();
        mav.setViewName("pages/acceptance/businessAcceptance");
        return  mav;
    }
    @RequestMapping("/bus1LoadAdd")
    public ModelAndView bus1LoadAdd() throws Exception{
        ModelAndView mav=new ModelAndView();
        mav.setViewName("pages/acceptance/businessAcceptance_add");
        return  mav;
    }

    @RequestMapping("/bus1Add")
    public ModelAndView bus1Add(Model model) throws Exception{
        //添加数据
        AccBusinessAdmissibility accBus=new AccBusinessAdmissibility();
        accBus.setBusinessNoticeNo("ywsl202001080000003");
        accBus.setReservationTime(new Date());
        accBus.setCustomName("TAO");
        accBus.setPickupAddress("巴基斯阿");
        accBus.setCustomCode(5);
        accBus.setLinkman("老王");
        accBus.setTelPhone("15378994555");
        accBus.setWeight(12.5);
        accBus.setVolume(10.3);
        accBus.setImportantHints("易碎物品");
        accBus.setArriveCity("郴州市");
        accBus.setPickerInfo(5);
        accBus.setSendAddress("郴州市详细地址");
        accBus.setProcessingUnit(9);
        accBus.setNotificationSource(false);
        accBus.setCustomNoModifyFlag(false);
        accBus.setSingleType("分单类型");
        accBus.setPackagesNum(1);
        accBus.setActualWeight(6.6);
        accBus.setBillingWeight(7.1);
        accBus.setPackingFee(2.0);
        accBus.setActualPacking(false);
       // busService.addBus(accBus);
        //重新查询数据
        ModelAndView mav=new ModelAndView();
        List<AccBusinessAdmissibility> list=busService.testQuery();
        System.out.printf(list.get(0)+"");
        model.addAttribute("list",list);
        mav.setViewName("pages/acceptance/businessAcceptance");
        return  mav;
    }

    @RequestMapping("/bus1LoadUpdate")
    public ModelAndView bus1LoadUpdate() throws Exception{
        ModelAndView mav=new ModelAndView();
        mav.setViewName("pages/acceptance/businessAcceptance_update");
        return  mav;
    }

    @RequestMapping("/bus2")
    public ModelAndView bus2() throws Exception{
        ModelAndView mav=new ModelAndView();
        mav.setViewName("pages/acceptance/worksheetQuickInput");
        return  mav;
    }
    @RequestMapping("/bus3")
    public ModelAndView bus3() throws Exception{
        ModelAndView mav=new ModelAndView();
        mav.setViewName("pages/acceptance/worksheetQuery");
        return  mav;
    }
}
