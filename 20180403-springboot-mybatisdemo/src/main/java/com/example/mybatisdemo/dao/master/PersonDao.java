package com.example.mybatisdemo.dao.master;

import com.example.mybatisdemo.dao.master.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PersonDao {
    @Select("select name from tbl_person where id=#{id}")
    public String getNameById(int id);

    @Select("select * from tbl_person")
    public List<Person> getPersonById(int id);
}
