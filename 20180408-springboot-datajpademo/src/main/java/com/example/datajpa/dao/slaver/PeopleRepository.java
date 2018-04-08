package com.example.datajpa.dao.slaver;

import com.example.datajpa.dao.master.entity.Person;
import com.example.datajpa.dao.slaver.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by Administrator on 2018-04-08.
 */

public interface PeopleRepository extends JpaRepository<People,Long> {

    //默认的查询方法，方法命名规则为findBy+字段
    People findByName(String name);

    //自定义的查询方法
    @Query("from People people where people.name=name")
    People findPeople(@Param("name") String name);
}
