package com.example.logistics.service.impl;

import com.example.logistics.dao.IaeDepartureMapper;
import com.example.logistics.model.IaeDeparture;
import com.example.logistics.service.IaeDepartureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class IaeDepartureServiceImpl implements IaeDepartureService {

    @Autowired
    private IaeDepartureMapper iaeDepartureMapper;

    @Override
    public List<IaeDeparture> queryIaeDeparture(int pages, int count) {
        return iaeDepartureMapper.queryIaeDeparture(pages, count);
    }

    @Override
    public Integer pagecount() {
        return iaeDepartureMapper.pagecount();
    }
}
