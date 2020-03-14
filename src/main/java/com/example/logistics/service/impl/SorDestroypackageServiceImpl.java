package com.example.logistics.service.impl;

import com.example.logistics.dao.SorDestroypackageMapper;
import com.example.logistics.model.SorDestroypackage;
import com.example.logistics.service.SorDestroypackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SorDestroypackageServiceImpl implements SorDestroypackageService {

    @Autowired
    private SorDestroypackageMapper sorDestroypackageMapper;

    @Override
    public int addSorDestroypackage(SorDestroypackage sorDestroypackage) {
        return sorDestroypackageMapper.addSorDestroypackage(sorDestroypackage);
    }
}
