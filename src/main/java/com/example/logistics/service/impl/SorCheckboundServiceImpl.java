package com.example.logistics.service.impl;

import com.example.logistics.dao.SorCheckboundMapper;
import com.example.logistics.model.SorCheckbound;
import com.example.logistics.service.SorCheckboundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SorCheckboundServiceImpl implements SorCheckboundService {

    @Autowired
    private SorCheckboundMapper sorCheckboundMapper;

    @Override
    public List<SorCheckbound> querySorCheckbound(int pages, int count) {
        return sorCheckboundMapper.querySorCheckbound(pages, count);
    }

    @Override
    public Integer pagecount() {
        return sorCheckboundMapper.pagecount();
    }

    @Override
    public int addSorCheckbound(SorCheckbound sorCheckbound) {
        return sorCheckboundMapper.addSorCheckbound(sorCheckbound);
    }

    @Override
    public int delSorCheckbound(int cid) {
        return sorCheckboundMapper.delSorCheckbound(cid);
    }

    @Override
    public SorCheckbound queryByCid(int cid) {
        return sorCheckboundMapper.queryByCid(cid);
    }

    @Override
    public int updateSorCheckbound(SorCheckbound sorCheckbound) {
        return sorCheckboundMapper.updateSorCheckbound(sorCheckbound);
    }
}
