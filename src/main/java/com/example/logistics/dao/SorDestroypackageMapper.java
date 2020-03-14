package com.example.logistics.dao;

import com.example.logistics.model.SorDestroypackage;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface SorDestroypackageMapper {

    @Insert("insert into sor_destroypackage (ID,DestroyPerson,CloseInt,ArrivePlace,PlanArrivePlace,ArriveTime,AllTicket,AllCount,AllWeight,AllBody,StateInt,Question) values(#{id},#{destroyperson},#{closeint},#{arriveplace},#{planArriveplace},NOW(),#{allticket},#{allcount},#{allweight},#{allbody},#{stateint},#{question})")
    int addSorDestroypackage(SorDestroypackage sorDestroypackage);
}
