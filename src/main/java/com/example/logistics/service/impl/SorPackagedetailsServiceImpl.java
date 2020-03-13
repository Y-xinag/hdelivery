package com.example.logistics.service.impl;

import com.example.logistics.dao.SorPackagedetailsMapper;
import com.example.logistics.model.SorPackage;

import com.example.logistics.model.SorPackagedetails;
import com.example.logistics.service.SorPackagedetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SorPackagedetailsServiceImpl implements SorPackagedetailsService {

    @Autowired
    private SorPackagedetailsMapper sorPackagedetailsMapper;


    @Override
    public int addSorPackagedetails(SorPackagedetails sorPackagedetails) {
        return sorPackagedetailsMapper.addSorPackagedetails(sorPackagedetails);
    }
}
