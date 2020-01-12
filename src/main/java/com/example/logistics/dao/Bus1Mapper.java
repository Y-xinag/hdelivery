package com.example.logistics.dao;

import com.example.logistics.model.AccBusinessAdmissibility;
import com.example.logistics.model.Bus1Result;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface Bus1Mapper {
    Map<Integer,Bus1Result> findAll();
    List<AccBusinessAdmissibility> testQuery();
    String addBus(AccBusinessAdmissibility accBusinessAdmissibility);
    String deleteBus(int id);
}
