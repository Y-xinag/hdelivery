package com.example.logistics.dao;

import com.example.logistics.model.SorOutbound;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface SorOutboundMapper {
    //分页查询
    List<SorOutbound> querySorOutbound(@Param("pages") int pages,@Param("count") int count);

    //查询入库表数量
    @Select("SELECT count(1) from sor_outbound")
    Integer pagecount();
}