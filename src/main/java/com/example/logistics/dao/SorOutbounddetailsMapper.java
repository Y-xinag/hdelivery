package com.example.logistics.dao;

import com.example.logistics.model.SorOutbounddetails;
import com.example.logistics.model.SorOutbounddetailsExample;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SorOutbounddetailsMapper {

    @Insert("insert into sor_outbounddetails (ID,PackageID,Weight,Volume,ScanDate,IsScan,IsNextStorage,IsDoubleStorage) values(#{id},#{packageid},#{weight},#{volume},NOW(),#{isscan},#{isnextstorage},#{isdoublestorage})")
    int addSorOutbounddetails(SorOutbounddetails sorOutbounddetails);


}