package com.example.logistics.dao;

import com.example.logistics.model.PacPackaging;
import com.example.logistics.model.PacPackagingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface PacPackagingMapper {

    @Select("select * from pac_packaging")
    public List<PacPackaging> fin();
}