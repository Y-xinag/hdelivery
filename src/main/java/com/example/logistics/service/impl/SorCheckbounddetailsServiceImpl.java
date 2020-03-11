package com.example.logistics.service.impl;

import com.example.logistics.dao.SorCheckbounddetailsMapper;
import com.example.logistics.model.SorCheckbounddetails;
import com.example.logistics.service.SorCheckbounddetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SorCheckbounddetailsServiceImpl implements SorCheckbounddetailsService {
    @Autowired
    private SorCheckbounddetailsMapper sorCheckbounddetailsMapper;

    @Override
    public int addSorCheckbounddetails(SorCheckbounddetails sorCheckbounddetails) {
        return sorCheckbounddetailsMapper.addSorCheckbounddetails(sorCheckbounddetails);
    }
}
