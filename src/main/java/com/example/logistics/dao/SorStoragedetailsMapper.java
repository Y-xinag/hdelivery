package com.example.logistics.dao;

import com.example.logistics.model.SorStoragedetails;
import com.example.logistics.model.SorStoragedetailsExample;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface SorStoragedetailsMapper {
    //添加
    @Insert("insert into sor_storagedetails(SID,PackageID,Weight,OutBoundID,State) values(#{sid},#{packageid},#{weight},#{outboundid},#{state})")
    int addSorStoragedetails(SorStoragedetails sorStoragedetails);

    //查询分页
    @Select("select *from sor_storagedetails LIMIT #{pages},#{count}")
    List<SorStoragedetails> querySorStoragedetails(@Param("pages") int pages,@Param("count") int count);

    //数量
    @Select("select count(1) from sor_storagedetails")
    Integer pagecount();

    //删除关联出货交接单
    int delSorStoragedetails(SorStoragedetails sorStoragedetails);

}