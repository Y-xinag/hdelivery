package com.example.logistics.dao;

import com.example.logistics.model.SorAbnormal;

import com.example.logistics.model.SorCheckbound;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SorAbnormalMapper {

    @Insert("insert into sor_abnormal (ID,LaunchDate,LaunchPerson,LaunchCompany,AbnormalType,TransferInt,CargoInt,PackageInt,HedgeAbnInt,AboState,HandleDate) values (#{id},NOW(),#{launchperson},#{launchcompany},#{abnormaltype},#{transferint},#{cargoint},#{packageint},#{hedgeabnint},#{abostate},NOW())")
    int addSorAbnormal(SorAbnormal sorAbnormal);


    //查询分页
    @Select("select *from sor_abnormal LIMIT #{pages},#{count}")
    List<SorAbnormal> querySorAbnormal(@Param("pages") int pages, @Param("count") int count);

    //查询入库表数量
    @Select("SELECT count(1) from sor_abnormal")
    Integer pagecount();
}