package com.example.springboot3.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SalaryDepartmentUpdateDTO {
    private BigDecimal salary;
    private String department;
}
