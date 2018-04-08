package com.example.datajpa.dao.master.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Administrator on 2018-04-03.
 */

@Data
@Entity
@Table(name="tbl_person")
public class Person {
    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private String desc;
}
