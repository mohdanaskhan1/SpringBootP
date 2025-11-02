package com.example.springboot3.service;

import com.example.springboot3.dto.EmployeeDTO;
import com.example.springboot3.entity.Employees;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employees> getAllEmployees();
    Optional<Employees> getEmployeeById(Long id);
    Employees create(EmployeeDTO employeeDto);
    Employees updateSalary(BigDecimal newSalary, Long id);
    Employees updateSalaryDept(BigDecimal newSalary, String newDept, Long id);
    Employees updateAll(Long id, EmployeeDTO employeeDTO);
    void deleteEmployeeById(Long id);
    List<String> getEmployeeNameByCity(String city);
    public List<Employees> getEmployeeGreaterThan(BigDecimal Salary);
}
