package com.example.logistics.service.impl;

import com.example.logistics.dao.SorAbnormalMapper;
import com.example.logistics.model.SorAbnormal;
import com.example.logistics.service.SorAbnormalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SorAbnormalServiceImpl implements SorAbnormalService {

    @Autowired
    private SorAbnormalMapper sorAbnormalMapper;

    @Override
    public int addSorAbnormal(SorAbnormal sorAbnormal) {
        return sorAbnormalMapper.addSorAbnormal(sorAbnormal);
    }

    @Override
    public List<SorAbnormal> querySorAbnormal(int pages, int count) {
        return sorAbnormalMapper.querySorAbnormal(pages, count);
    }

    @Override
    public Integer pagecount() {
        return sorAbnormalMapper.pagecount();
    }
}
