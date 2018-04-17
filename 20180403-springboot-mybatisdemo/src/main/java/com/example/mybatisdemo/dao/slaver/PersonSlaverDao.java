package com.example.mybatisdemo.dao.slaver;

import com.example.mybatisdemo.dao.slaver.entity.PersonSlaver;
import org.springframework.stereotype.Repository;

/**
 * 方法二：采用xml配置的方法拼接sql语句，本例采用了free-mybatis插件进行xml代码生成
 *
 * */
@Repository
public interface PersonSlaverDao {
     String hello="fds";
  PersonSlaver findPersonById(int id);
  String  findName();
}
