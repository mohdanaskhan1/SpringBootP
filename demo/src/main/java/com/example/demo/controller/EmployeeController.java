package com.example.demo.controller;

import com.example.demo.dto.SalaryUpdateDTO;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@Valid @RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.create(employee));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
        return ResponseEntity.ok(employeeService.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return ResponseEntity.ok(employeeService.getAll());
    }

    @PutMapping("/{id}/updateSalary")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id,
                                                   @Valid @RequestBody SalaryUpdateDTO salaryUpdateDTO) {
        return ResponseEntity.ok(employeeService.update(id, salaryUpdateDTO.getSalary()));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        employeeService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
