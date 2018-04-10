package com.example.datajpa.controller;

import com.example.datajpa.dao.master.PersonRepository;
import com.example.datajpa.dao.master.entity.Person;
import com.example.datajpa.dao.slaver.PeopleRepository;
import com.example.datajpa.dao.slaver.entity.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018-04-03.
 */

@RestController
public class TestController {
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private PeopleRepository peopleRepository;

    @RequestMapping("/test1")
    public Person test1(String name){
        return personRepository.findByName(name);
    }

    @RequestMapping("/test2")
    public People test2(String name){
        return peopleRepository.findByName(name);
    }

}
