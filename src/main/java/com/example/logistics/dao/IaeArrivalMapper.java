package com.example.logistics.dao;

import com.example.logistics.model.IaeArrival;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface IaeArrivalMapper {
    @Select("select *from iae_arrival  ORDER BY TimeLimit DESC LIMIT #{pages},#{count}")
    List<IaeArrival> queryIaeArrival(@Param("pages") int pages, @Param("count") int count);

    //查询配载表数量
    @Select("select count(1) from iae_arrival")
    Integer pagecount();

    List<IaeArrival> queryIaeArrivalNo(@Param("pages") int pages, @Param("count") int count);
}