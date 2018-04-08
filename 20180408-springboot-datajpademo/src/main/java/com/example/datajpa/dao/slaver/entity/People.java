package com.example.datajpa.dao.slaver.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Administrator on 2018-04-08.
 */

@Data
@Entity
@Table(name="tbl_people")
public class People {
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
