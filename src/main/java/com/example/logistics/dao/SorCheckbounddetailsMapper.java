package com.example.logistics.dao;

import com.example.logistics.model.SorCheckbounddetails;
import com.example.logistics.model.SorCheckbounddetailsExample;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SorCheckbounddetailsMapper {

    @Insert("insert into sor_checkbounddetails(ID,PackageID,CargoCount,Weight,Volume,CargoType,Direction,StoragePerson,StorageDate) values(#{id},#{packageid},#{cargocount},#{weight},#{volume},#{cargotype},#{direction},#{storageperson},NOW())")
    int addSorCheckbounddetails(SorCheckbounddetails sorCheckbounddetails);

}