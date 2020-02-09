package com.example.logistics.service.impl;

import com.example.logistics.dao.Bus1Mapper;
import com.example.logistics.model.AccBusinessAdmissibility;
import com.example.logistics.model.Bus1Result;
import com.example.logistics.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BusServiceImpl implements BusService {
    @Autowired
    private Bus1Mapper bus1Mapper;
    @Override
    public Map<Integer,Bus1Result> findAll() {
        return bus1Mapper.findAll();
    }
    public List<AccBusinessAdmissibility> testQuery(){return  bus1Mapper.testQuery();}

    @Override
    public String addBus(AccBusinessAdmissibility accBusinessAdmissibility) {
        return null;
    }
}
