package com.example.springboot3.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class EmployeeDTO {
    private String firstName;
    private String lastName;
    private BigDecimal salary;
    private String department;
    private String city;

}
