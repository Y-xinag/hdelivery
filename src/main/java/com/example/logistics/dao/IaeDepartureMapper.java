package com.example.logistics.dao;

import com.example.logistics.model.IaeDeparture;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface IaeDepartureMapper {
    @Select("select *from iae_departure  ORDER BY TimeLimit DESC LIMIT #{pages},#{count}")
    List<IaeDeparture> queryIaeDeparture(@Param("pages") int pages, @Param("count") int count);

    //查询配载表数量
    @Select("select count(1) from iae_departure")
    Integer pagecount();
}