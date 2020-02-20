package com.example.logistics.service.impl;

import com.example.logistics.dao.SorOutboundMapper;
import com.example.logistics.model.SorOutbound;
import com.example.logistics.service.SorOutboundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SorOutboundServiceImpl implements SorOutboundService {

    @Autowired
    private SorOutboundMapper sorOutboundMapper;

    @Override
    public List<SorOutbound> querySorOutbound(int pages, int count) {
        return sorOutboundMapper.querySorOutbound(pages, count);
    }

    @Override
    public Integer pagecount() {
        return sorOutboundMapper.pagecount();
    }
}
