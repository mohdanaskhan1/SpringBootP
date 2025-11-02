package com.example.springboot3.service;

import com.example.springboot3.dto.EmployeeDTO;
import com.example.springboot3.entity.Employees;
import com.example.springboot3.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public List<Employees> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employees> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public Employees create(EmployeeDTO employeeDTO) {
        Employees employee = new Employees();
        employee.setFirstName(employeeDTO.getFirstName());
        employee.setLastName(employeeDTO.getLastName());
        employee.setSalary(employeeDTO.getSalary());
        employee.setDepartment(employeeDTO.getDepartment());
        employee.setCity(employeeDTO.getCity());
        return employeeRepository.save(employee);
    }

    @Override
    public Employees updateSalary(BigDecimal newSalary, Long id) {
        int rowsUpdated = employeeRepository.updateSalary(newSalary, id);
        if (rowsUpdated == 0){
            throw new RuntimeException("Employee not found");
        }
        return employeeRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Employee not found after update with id "+id));
    }

    @Override
    public Employees updateSalaryDept(BigDecimal newSalary, String newDept, Long id) {
        int rowsUpdated = employeeRepository.UpdateSalaryDepartment(newSalary, newDept, id);
        if (rowsUpdated == 0){
            throw new RuntimeException("Employee not found");
        }
        return employeeRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Employee not found after update with id "+id));
    }

    @Override
    public Employees updateAll(Long id, EmployeeDTO employeeDTO) {
        Employees emp = employeeRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Employee not found"));
        emp.setFirstName(employeeDTO.getFirstName());
        emp.setLastName(employeeDTO.getLastName());
        emp.setSalary(employeeDTO.getSalary());
        emp.setDepartment(employeeDTO.getDepartment());
        emp.setCity(employeeDTO.getCity());
        return employeeRepository.save(emp);
    }


    @Override
    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<String> getEmployeeNameByCity(String city) {
        List<Employees> empCity = employeeRepository.findEmployeesByCityIgnoreCase(city);
        return empCity.stream().map(emp -> emp.getFirstName() + " " + emp.getLastName()).toList();
    }

    @Override
    public List<Employees> getEmployeeGreaterThan(BigDecimal Salary){
        return employeeRepository.findEmployeesBySalaryGreaterThan(Salary);
    }


}
