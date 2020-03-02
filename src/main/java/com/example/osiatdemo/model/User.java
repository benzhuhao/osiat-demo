package com.example.osiatdemo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;
    private String first_name;
    private String last_name;
    private int age;
    private String career;
}
