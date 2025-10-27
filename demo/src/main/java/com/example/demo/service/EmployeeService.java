package com.example.demo.service;

import com.example.demo.entity.Employee;

import java.math.BigDecimal;
import java.util.List;

public interface EmployeeService {

    Employee create(Employee employeeDto);
    Employee getById(Long id);
    List<Employee> getAll();
    Employee update(Long id, BigDecimal salary);
    void delete(Long id);

}