package com.example.logistics.dao;

import com.example.logistics.model.IaeArrival;
import com.example.logistics.model.IaeLineresource;
import com.example.logistics.model.IaeLineresourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface IaeLineresourceMapper {
    @Select("select *from iae_lineresource  ORDER BY TimeLimit DESC LIMIT #{pages},#{count}")
    List<IaeLineresource> queryIaeLineresource(@Param("pages") int pages, @Param("count") int count);

    //查询配载表数量
    @Select("select count(1) from iae_lineresource")
    Integer pagecount();
}