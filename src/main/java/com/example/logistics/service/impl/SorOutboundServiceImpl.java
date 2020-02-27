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

    @Override
    public int addSorOutbound(SorOutbound sorOutbound) {
        return sorOutboundMapper.addSorOutbound(sorOutbound);
    }

    @Override
    public int delSorOutbound(String id) {
        return sorOutboundMapper.delSorOutbound(id);
    }

    @Override
    public SorOutbound queryById(String id) {
        return sorOutboundMapper.queryById(id);
    }

    @Override
    public int updateSorOutbound(SorOutbound sorOutbound) {
        return sorOutboundMapper.updateSorOutbound(sorOutbound);
    }
}
