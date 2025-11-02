package com.example.springboot3.controller;

import com.example.springboot3.dto.EmployeeDTO;
import com.example.springboot3.dto.SalaryDepartmentUpdateDTO;
import com.example.springboot3.dto.SalaryUpdateDTO;
import com.example.springboot3.entity.Employees;
import com.example.springboot3.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RequestMapping("/api/emp/")
@RestController
public class MyController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employees> getEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Optional<Employees> getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    public Employees create(@RequestBody EmployeeDTO employeeDto) {
        return employeeService.create(employeeDto);
    }

    @PutMapping("updateSalary/{id}")
    public ResponseEntity<Employees> update(@PathVariable Long id, @RequestBody SalaryUpdateDTO salaryUpdateDTO) {
        return ResponseEntity.ok(employeeService.updateSalary(salaryUpdateDTO.getSalary(),id));
    }

    @PutMapping("updateSalaryDept/{id}")
    public ResponseEntity<Employees> update1(@PathVariable Long id, @RequestBody SalaryDepartmentUpdateDTO salaryDepartmentUpdateDTO) {
        return ResponseEntity.ok(employeeService.updateSalaryDept(salaryDepartmentUpdateDTO.getSalary(),salaryDepartmentUpdateDTO.getDepartment(),id));
    }

    @PutMapping("update/{id}")
    public ResponseEntity<Employees> update2(@PathVariable Long id, @RequestBody EmployeeDTO employeeDTO) {
        return ResponseEntity.ok(employeeService.updateAll(id,employeeDTO));
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        employeeService.deleteEmployeeById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("City/{city}")
    public ResponseEntity<List<String>> getEmployeesByCity(@PathVariable String city) {
        List<String> employeeNameByCity = employeeService.getEmployeeNameByCity(city);
        if(employeeNameByCity.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(employeeNameByCity);
    }

    @GetMapping("Salary/{Salary}")
    public ResponseEntity<List<Employees>> getSalaryGreaterThan(@PathVariable BigDecimal Salary) {
        List<Employees> employee = employeeService.getEmployeeGreaterThan(Salary);
        if (employee.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        else {
            return ResponseEntity.ok(employee);
        }

    }









}
