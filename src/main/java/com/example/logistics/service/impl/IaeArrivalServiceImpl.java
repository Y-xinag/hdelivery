package com.example.logistics.service.impl;

import com.example.logistics.dao.IaeArrivalMapper;
import com.example.logistics.model.IaeArrival;
import com.example.logistics.service.IaeArrivalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IaeArrivalServiceImpl implements IaeArrivalService {

    @Autowired
    private IaeArrivalMapper iaeArrivalMapper;

    @Override
    public List<IaeArrival> queryIaeArrival(int pages, int count) {
        return iaeArrivalMapper.queryIaeArrival(pages, count);
    }

    @Override
    public Integer pagecount() {
        return iaeArrivalMapper.pagecount();
    }

    @Override
    public List<IaeArrival> queryIaeArrivalNo(int pages, int count) {
        return iaeArrivalMapper.queryIaeArrivalNo(pages, count);
    }
}
