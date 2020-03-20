package com.example.logistics.service.impl;

import com.example.logistics.dao.SorPackageMapper;
import com.example.logistics.model.SorPackage;
import com.example.logistics.service.SorPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SorPackageServiceImpl implements SorPackageService {

    @Autowired
    private SorPackageMapper sorPackageMapper;

    @Override
    public int addSorPackage(SorPackage sorPackage) {
        return sorPackageMapper.addSorPackage(sorPackage);
    }

    @Override
    public List<SorPackage> queryAllpackage(int pages, int count) {
        return sorPackageMapper.queryAllpackage(pages, count);
    }

    @Override
    public Integer pagecount() {
        return sorPackageMapper.pagecount();
    }
}
