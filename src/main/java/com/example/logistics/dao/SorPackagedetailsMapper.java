package com.example.logistics.dao;

import com.example.logistics.model.SorPackagedetails;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface SorPackagedetailsMapper {

    @Insert("insert into sor_packagedetails (ID,WareName,Destination,Ticket,ActualCargoInt,CargoInt,Weight,Volume,Service,ImportantHints,Ask,InputType) values(#{id},#{warename},#{destination},#{ticket},#{actualcargoint},#{cargoint},#{weight},#{volume},NOW(),#{importanthints},#{ask},'植入')")
    int addSorPackagedetails(SorPackagedetails sorPackagedetails);
}