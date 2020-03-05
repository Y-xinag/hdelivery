package com.example.logistics.service.impl;

import com.example.logistics.dao.SorOutbounddetailsMapper;
import com.example.logistics.model.SorOutbounddetails;
import com.example.logistics.service.SorOutbounddetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SorOutbounddetailsServiceImpl implements SorOutbounddetailsService {

    @Autowired
    private SorOutbounddetailsMapper sorOutbounddetailsMapper;

    @Override
    public int addSorOutbounddetails(SorOutbounddetails sorOutbounddetails) {
        return sorOutbounddetailsMapper.addSorOutbounddetails(sorOutbounddetails);
    }
}
