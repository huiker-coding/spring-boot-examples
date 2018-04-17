package com.example.mybatisdemo.dao.master;

import com.example.mybatisdemo.dao.master.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 方法一：使用注解的方式，这种方式可以方便的进行简单sql的书写
 *        使用注解的方式无需进行mybaits xml文件的编写了；
 * */
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


    @Select("select * from tbl_person where id=#{id}")
    public List<Person> getPersonById(int id);
}
