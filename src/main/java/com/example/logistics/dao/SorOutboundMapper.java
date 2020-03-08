package com.example.logistics.dao;

import com.example.logistics.model.SorOutbound;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
public interface SorOutboundMapper {
    //分页查询
    List<SorOutbound> querySorOutbound(@Param("pages") int pages,@Param("count") int count);

    //查询入库表数量
    @Select("SELECT count(1) from sor_outbound")
    Integer pagecount();

    //新增入库
    @Insert("INSERT INTO sor_outbound(OutBoundID,HandoverType,Line,Direction,AcceptPerson,Carriers,DeliveryPerson,DeliveryDate,DeliveryCompany,EnterPerson,EnterDate) VALUES(#{outboundid},#{handovertype},#{line},#{direction},#{acceptperson},#{carriers},#{deliveryperson},NOW(),#{deliverycompany},#{enterperson},NOW()); ")
    int addSorOutbound(SorOutbound sorOutbound);

    //删除入库
    @Delete("delete from sor_outbound where OutBoundID=#{id} ")
    int delSorOutbound(String id);

    //根据id查询
    @Select("select *from sor_outbound where OutBoundID=#{id}")
    SorOutbound queryById(String id);

    //更改入库
    @Update("update sor_outbound set HandoverType=#{handovertype},Line=#{line},Direction=#{direction},AcceptPerson=#{acceptperson},Carriers=#{carriers},DeliveryPerson=#{deliveryperson},DeliveryDate=NOW(),DeliveryCompany=#{deliverycompany},EnterPerson=#{enterperson},EnterDate=NOW() where OutBoundID=#{outboundid}")
    int updateSorOutbound(SorOutbound sorOutbound);
}