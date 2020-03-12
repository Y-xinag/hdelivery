package com.example.logistics.dao;

import com.example.logistics.model.SorCheckbound;
import com.example.logistics.model.SorCheckbounddetails;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SorCheckbounddetailsMapper {

    @Insert("insert into sor_checkbounddetails(ID,PackageID,CargoCount,Weight,Volume,CargoType,Direction,StoragePerson,StorageDate) values(#{id},#{packageid},#{cargocount},#{weight},#{volume},#{cargotype},#{direction},#{storageperson},NOW())")
    int addSorCheckbounddetails(SorCheckbounddetails sorCheckbounddetails);

    //查询分页
    List<SorCheckbounddetails> querySorCheckbounddetails(@Param("pages") int pages, @Param("count") int count);

    //查询入库表数量
    @Select("SELECT count(1) from sor_checkbounddetails")
    Integer pagecount();

    //查询单个
    @Select("select *from sor_checkbounddetails where ID=#{id}")
    SorCheckbounddetails queryBycdid(int id);

    //修改
    @Update("update sor_checkbounddetails set PackageID=#{packageid},CargoCount=#{cargocount},Weight=#{weight},Volume=#{volume},CargoType=#{cargotype},Direction=#{direction},StoragePerson=#{storageperson},StorageDate=NOW() where ID=#{id} ")
    int updateSorCheckbounddetails(SorCheckbounddetails sorCheckbounddetails);

    //删除
    @Delete("delete from sor_checkbounddetails where ID=#{id}")
    int delSorCheckbounddetails(int id);
}