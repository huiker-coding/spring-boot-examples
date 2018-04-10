package com.example.datajpa.dao.master;

import com.example.datajpa.dao.master.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by Administrator on 2018-04-08.
 */

public interface PersonRepository extends JpaRepository<Person,Long> {

//默认的查询方法，方法命名规则为findBy+字段
Person findByName(String name);

//自定义的查询方法
@Query("from Person person where person.name=name")
Person findPerson(@Param("name") String name);

}
