package com.example.logistics.service.impl;

import com.example.logistics.dao.SorStoragedetailsMapper;
import com.example.logistics.model.SorStoragedetails;
import com.example.logistics.service.SorStoragedetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SorStoragedetailsServiceImpl implements SorStoragedetailsService {
    @Autowired
    private SorStoragedetailsMapper sorStoragedetailsMapper;

    @Override
    public int addSorStoragedetails(SorStoragedetails sorStoragedetails) {
        return sorStoragedetailsMapper.addSorStoragedetails(sorStoragedetails);
    }

    @Override
    public List<SorStoragedetails> querySorStoragedetails(int pages, int count) {
        return sorStoragedetailsMapper.querySorStoragedetails(pages, count);
    }

    @Override
    public Integer pagecount() {
        return sorStoragedetailsMapper.pagecount();
    }
}
