package com.example.logistics.service.impl;

import com.example.logistics.dao.SorCheckbounddetailsMapper;
import com.example.logistics.model.SorCheckbound;
import com.example.logistics.model.SorCheckbounddetails;
import com.example.logistics.service.SorCheckbounddetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SorCheckbounddetailsServiceImpl implements SorCheckbounddetailsService {
    @Autowired
    private SorCheckbounddetailsMapper sorCheckbounddetailsMapper;

    @Override
    public int addSorCheckbounddetails(SorCheckbounddetails sorCheckbounddetails) {
        return sorCheckbounddetailsMapper.addSorCheckbounddetails(sorCheckbounddetails);
    }

    @Override
    public List<SorCheckbounddetails> querySorCheckbounddetails(int pages, int count) {
        return sorCheckbounddetailsMapper.querySorCheckbounddetails(pages, count);
    }

    @Override
    public Integer pagecount() {
        return sorCheckbounddetailsMapper.pagecount();
    }

    @Override
    public SorCheckbounddetails queryBycdid(int id) {
        return sorCheckbounddetailsMapper.queryBycdid(id);
    }

    @Override
    public int updateSorCheckbounddetails(SorCheckbounddetails sorCheckbounddetails) {
        return sorCheckbounddetailsMapper.updateSorCheckbounddetails(sorCheckbounddetails);
    }

    @Override
    public int delSorCheckbounddetails(int id) {
        return sorCheckbounddetailsMapper.delSorCheckbounddetails(id);
    }
}
