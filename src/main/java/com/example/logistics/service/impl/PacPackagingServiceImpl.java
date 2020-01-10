package com.example.logistics.service.impl;

import com.example.logistics.dao.PacPackagingMapper;
import com.example.logistics.model.PacPackaging;
import com.example.logistics.service.PacPackagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacPackagingServiceImpl implements PacPackagingService {
    @Autowired
    private PacPackagingMapper pacPackagingMapper;

    @Override
    public List<PacPackaging> fin() {
        return pacPackagingMapper.fin();
    }
}
