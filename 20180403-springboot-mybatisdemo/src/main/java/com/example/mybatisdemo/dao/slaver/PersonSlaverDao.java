package com.example.mybatisdemo.dao.slaver;

import com.example.mybatisdemo.dao.slaver.entity.PersonSlaver;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PersonSlaverDao {
    @Select("select name from tbl_person where id=#{id}")
    public String getNameById(int id);

    @Select("select * from tbl_person where id=#{id}")
    public List<PersonSlaver> getPersonById(int id);
}
