package com.example.logistics.dao;

import com.example.logistics.model.SorCheckbound;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SorCheckboundMapper {
    //查询分页
    List<SorCheckbound> querySorCheckbound(@Param("pages") int pages, @Param("count") int count);

    //查询入库表数量
    @Select("SELECT count(1) from sor_checkbound")
    Integer pagecount();

}