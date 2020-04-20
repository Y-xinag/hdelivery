package com.example.logistics.service.impl;

import com.example.logistics.dao.IaeTimeinputMapper;
import com.example.logistics.model.IaeLineresource;
import com.example.logistics.service.IaeTimeinputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IaeTimeinputServiceImpl implements IaeTimeinputService {

    @Autowired
    private IaeTimeinputMapper iaeTimeinputMapper;

    @Override
    public List<IaeLineresource> queryIaeTimeinput(int pages, int count) {
        return iaeTimeinputMapper.queryIaeTimeinput(pages, count);
    }

    @Override
    public Integer pagecount() {
        return iaeTimeinputMapper.pagecount();
    }
}
