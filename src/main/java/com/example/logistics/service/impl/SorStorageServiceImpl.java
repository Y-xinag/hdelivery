package com.example.logistics.service.impl;

import com.example.logistics.dao.SorStorageMapper;
import com.example.logistics.model.SorStorage;
import com.example.logistics.service.SorStroageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SorStorageServiceImpl implements SorStroageService {
    @Autowired
    private SorStorageMapper sorStorageMapper;

    @Override
    public int addSorStorage(SorStorage sorStorage) {
        return sorStorageMapper.addSorStorage(sorStorage);
    }

    @Override
    public List<SorStorage> querySorStorage(int pages,int count) {
        return sorStorageMapper.querySorStorage(pages,count);
    }

    @Override
    public Integer pagecount() {
        return sorStorageMapper.pagecount();
    }

    @Override
    public SorStorage queryById(int id) {
        return sorStorageMapper.queryById(id);
    }

    @Override
    public int updateSorStorage(SorStorage sorStorage) {
        return sorStorageMapper.updateSorStorage(sorStorage);
    }

    @Override
    public int delSorStorage(int sid) {
        return sorStorageMapper.delSorStorage(sid);
    }
}
