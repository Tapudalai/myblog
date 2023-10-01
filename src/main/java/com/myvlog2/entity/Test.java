package com.myvlog2.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "ttable")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "city",nullable = false)
    private String city;

}
