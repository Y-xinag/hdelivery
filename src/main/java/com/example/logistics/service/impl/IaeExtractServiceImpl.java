package com.example.logistics.service.impl;

import com.example.logistics.dao.IaeExtractMapper;
import com.example.logistics.model.IaeExtract;
import com.example.logistics.service.IaeExtractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IaeExtractServiceImpl implements IaeExtractService {

    @Autowired
    private IaeExtractMapper iaeExtractMapper;

    @Override
    public List<IaeExtract> queryIaeExtract(int pages, int count) {
        return iaeExtractMapper.queryIaeExtract(pages, count);
    }

    @Override
    public Integer pagecount() {
        return iaeExtractMapper.pagecount();
    }
}
