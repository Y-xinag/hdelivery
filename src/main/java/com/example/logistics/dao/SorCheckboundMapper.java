package com.example.logistics.dao;

import com.example.logistics.model.SorCheckbound;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SorCheckboundMapper {
    //查询分页
    List<SorCheckbound> querySorCheckbound(@Param("pages") int pages, @Param("count") int count);

    //查询入库表数量
    @Select("SELECT count(1) from sor_checkbound")
    Integer pagecount();

    //增
    @Insert("insert into sor_checkbound (CID,ScanID,CargoSum,CheckPerson,CheckDate,CheckCompany) values(#{cid},#{scanid},#{cargosum},#{checkperson},NOW(),#{checkcompany})")
    int addSorCheckbound(SorCheckbound sorCheckbound);

    //删
    @Delete("delete from sor_checkbound where CID=#{cid}")
    int delSorCheckbound(int cid);

    //单个
    @Select("select *from  sor_checkbound where CID=#{cid}")
    SorCheckbound queryByCid(int cid);

    //改
    @Update("update sor_checkbound set ScanID=#{scanid},CargoSum=#{cargosum},CheckPerson=#{checkperson},CheckDate=NOW(),CheckCompany=#{checkcompany} where CID=#{cid}")
    int updateSorCheckbound(SorCheckbound sorCheckbound);

}