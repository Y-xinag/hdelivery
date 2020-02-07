package com.example.logistics.service;

import com.example.logistics.model.AccBusinessAdmissibility;
import com.example.logistics.model.Bus1Result;

import java.util.List;
import java.util.Map;

public interface BusService {
    Map<Integer,Bus1Result> findAll();
    List<AccBusinessAdmissibility> testQuery();
    String addBus(AccBusinessAdmissibility accBusinessAdmissibility);
}
