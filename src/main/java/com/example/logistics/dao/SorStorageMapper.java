package com.example.logistics.dao;

import com.example.logistics.model.SorStorage;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
public interface SorStorageMapper {
    //增加入库
    @Insert("INSERT INTO sor_storage(ID,AcceptDate,AcceptPerson,AcceptCompany,DeliveryPerson,DeliveryCompany) VALUES(#{id},NOW(),#{acceptperson},#{acceptcompany},#{deliveryperson},#{deliverycompany});")
    int addSorStorage(SorStorage sorStorage);

    //查询入库表
    List<SorStorage> querySorStorage(@Param("pages") int pages,@Param("count") int count);


    //查询入库表数量
    @Select("SELECT count(1) from sor_storage AS s1,sy_emp AS s2,sy_emp s3 where s1.AcceptPerson=s2.ID AND s1.DeliveryPerson=s3.ID")
    Integer pagecount();

    //根据单个id查询
    @Select("select *from sor_storage where SID=#{sid}")
    SorStorage queryById(int id);

    //修改入库表
    @Update("update sor_storage set ID=#{id},AcceptDate=NOW(),AcceptPerson=#{acceptperson},AcceptCompany=#{acceptcompany},DeliveryPerson=#{deliveryperson},DeliveryCompany=#{deliverycompany} where SID=#{sid}")
    int updateSorStorage(SorStorage sorStorage);

    //删除入库表
    @Delete("delete from sor_storage where SID=#{sid}")
    int delSorStorage(int sid);
}
