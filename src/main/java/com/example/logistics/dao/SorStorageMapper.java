package com.example.logistics.dao;

import com.example.logistics.model.SorStorage;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface SorStorageMapper {
    //增加入库
    //@Insert("INSERT INTO sor_storage(ID,AcceptDate,AcceptPerson,AcceptCompany,DeliveryPerson,DeliveryCompany) VALUES(#{id},NOW(),#{},#{},#{},#{});")
    int addSorStorage(SorStorage sorStorage);

    //查询入库表
    List<SorStorage> querySorStorage(@Param("pages") int pages,@Param("count") int count);


    //查询入库表数量
    @Select("SELECT count(1) from sor_storage AS s1,sy_emp AS s2,sy_emp s3 where s1.AcceptPerson=s2.ID AND s1.DeliveryPerson=s3.ID")
    Integer pagecount();
}
