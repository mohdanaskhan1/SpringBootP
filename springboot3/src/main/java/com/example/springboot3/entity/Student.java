package com.example.springboot3.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Student {
    @Id
    private int id;
    private String name;
    private int age;
    private String address;
}
