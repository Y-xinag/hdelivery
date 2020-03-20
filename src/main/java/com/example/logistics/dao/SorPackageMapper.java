package com.example.logistics.dao;

import com.example.logistics.model.SorPackage;

import com.example.logistics.model.SorStorage;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SorPackageMapper {
    @Insert("insert into sor_package(ID,PackagePerson,SealInt,Destination,ReckonDes,TimeLimit,TicketSum,CargoSum,WeightSum,VolumeSum,State,Ask) values (#{id},#{packageperson},#{sealint},#{destination},#{reckondes},NOW(),#{ticketsum},#{cargosum},#{weightsum},#{volumesum},#{state},#{ask})")
    int addSorPackage(SorPackage sorPackage);

    //查询入库表
    List<SorPackage> queryAllpackage(@Param("pages") int pages, @Param("count") int count);


    //查询入库表数量
    @Select("select count(1) from sor_package s1 LEFT JOIN sor_destroypackage s2 ON s1.ID=s2.ID INNER JOIN sy_emp s3 ON s1.PackagePerson=s3.ID")
    Integer pagecount();
}