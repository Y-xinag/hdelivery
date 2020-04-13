package com.example.logistics.dao;


import com.example.logistics.model.IaeExtract;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface IaeExtractMapper {
    @Select("select *from iae_extract  ORDER BY EstimateDate DESC LIMIT #{pages},#{count}")
    List<IaeExtract> queryIaeExtract(@Param("pages") int pages, @Param("count") int count);

    //查询配载表数量
    @Select("select count(1) from iae_extract")
    Integer pagecount();
}