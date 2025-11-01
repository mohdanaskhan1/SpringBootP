package com.example.springboot2.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Employee {
    @Id
    private int id;
    private String name;
    private String address;
    private double salary;
    private int ucode;
}
