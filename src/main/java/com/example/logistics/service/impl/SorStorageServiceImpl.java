package com.example.logistics.service.impl;

import com.example.logistics.dao.SorStorageMapper;
import com.example.logistics.model.SorStorage;
import com.example.logistics.model.SorStorageExample;
import com.example.logistics.service.SorStroageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SorStorageServiceImpl implements SorStroageService {
    @Autowired
    private SorStorageMapper storageMapper;

    @Override
    public int countByExample(SorStorageExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(SorStorageExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(SorStorage record) {
        return 0;
    }

    @Override
    public int insertSelective(SorStorage record) {
        return 0;
    }

    @Override
    public List<SorStorage> selectByExample(SorStorageExample example) {
        return null;
    }

    @Override
    public SorStorage selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(SorStorage record, SorStorageExample example) {
        return 0;
    }

    @Override
    public int updateByExample(SorStorage record, SorStorageExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(SorStorage record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(SorStorage record) {
        return 0;
    }

    @Override
    public int addSorStorage(SorStorage sorStorage) {
        return 0;
    }

    @Override
    public List<SorStorage> querySorStorage() {
        return storageMapper.querySorStorage();
    }
}
