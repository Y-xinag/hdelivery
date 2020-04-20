package com.example.logistics.service.impl;

import com.example.logistics.dao.IaeLineresourceMapper;
import com.example.logistics.model.IaeLineresource;
import com.example.logistics.service.IaeLineresourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IaeLineresourceServiceImpl implements IaeLineresourceService {

    @Autowired
    private IaeLineresourceMapper iaeLineresourceMapper;

    @Override
    public List<IaeLineresource> queryIaeLineresource(int pages, int count) {
        return iaeLineresourceMapper.queryIaeLineresource(pages, count);
    }

    @Override
    public Integer pagecount() {
        return iaeLineresourceMapper.pagecount();
    }
}
