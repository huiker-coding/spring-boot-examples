package com.example.mybatisdemo.dao.master;

import com.example.mybatisdemo.dao.master.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PersonDao {
    //数据批量查询
    String batchSql= "<script>" +
                "select * from tbl_person where id in" +
                "<foreach item='item' index='index' collection='ids' open='(' separator=',' close=')' >" +
                "#{item}" +
                "</foreach>" +
                "</script>";

    @Select(batchSql)
    public List<Person> getPersonById(@Param("ids") int[] ids);
}
