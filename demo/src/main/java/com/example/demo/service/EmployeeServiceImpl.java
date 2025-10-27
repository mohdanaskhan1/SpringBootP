package com.example.demo.service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee create(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getById(Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id " + id));
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee update(Long id, BigDecimal salary) {
        int rowsUpdated = employeeRepository.updateEmployee(salary, id);

        if (rowsUpdated == 0) {
            throw new RuntimeException("Employee not found with id " + id);
        }
        return employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found after update with id " + id));
    }

    @Override
    public void delete(Long id) {
        Employee existing = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id " + id));
        employeeRepository.delete(existing);
    }

}
