package com.example.logistics.dao;

import com.example.logistics.model.IaeLineresource;
import com.example.logistics.model.IaeTimeinput;
import com.example.logistics.model.IaeTimeinputExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface IaeTimeinputMapper {
    @Select("select *from IAE_TimeInput  ORDER BY InputDate DESC LIMIT #{pages},#{count}")
    List<IaeLineresource> queryIaeTimeinput(@Param("pages") int pages, @Param("count") int count);

    //查询配载表数量
    @Select("select count(1) from IAE_TimeInput")
    Integer pagecount();
}