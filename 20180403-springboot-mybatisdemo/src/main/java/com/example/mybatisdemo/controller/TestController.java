package com.example.mybatisdemo.controller;

import com.example.mybatisdemo.dao.master.PersonDao;
import com.example.mybatisdemo.dao.master.entity.Person;
import com.example.mybatisdemo.dao.slaver.PersonSlaverDao;
import com.example.mybatisdemo.dao.slaver.entity.PersonSlaver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 测试
 */

@RestController
public class TestController {
    @Autowired
    private PersonDao personDao;
    @Autowired
    private PersonSlaverDao personSlaverDao;

    @RequestMapping("/test1")
    public List<Person> test1(int id){
        return personDao.getPersonById(id);
    }

    @RequestMapping("/test2")
    public List<PersonSlaver> test2(int id){
        return personSlaverDao.getPersonById(id);
    }
}
