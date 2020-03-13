package com.example.logistics.dao;

import com.example.logistics.model.SorPackage;
import com.example.logistics.model.SorPackageExample;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SorPackageMapper {
    @Insert("insert into sor_package(ID,PackagePerson,SealInt,Destination,ReckonDes,TimeLimit,TicketSum,CargoSum,WeightSum,VolumeSum,State,Ask) values (#{id},#{packageperson},#{sealint},#{destination},#{reckondes},NOW(),#{ticketsum},#{cargosum},#{weightsum},#{volumesum},#{state},#{ask})")
    int addSorPackage(SorPackage sorPackage);
}