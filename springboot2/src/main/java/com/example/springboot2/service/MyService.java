package com.example.springboot2.service;

import com.example.springboot2.Entity.Employee;
import com.example.springboot2.Repository.Crud;
import com.example.springboot2.dto.EmployeeDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class MyService {

    @Autowired
    private Crud crud;

    @Autowired
    private ModelMapper modelMapper;

    public String insertData(EmployeeDTO employeeDTO){
//        Employee entity = modelMapper.map(employeeDTO, Employee.class);
//        entity.setUcode(employeeDTO.getId()+1000);
        Employee employee = new Employee();
        employee.setId(employeeDTO.getId());
        employee.setName(employeeDTO.getName());
        employee.setSalary(employeeDTO.getSalary());
        employee.setAddress(employeeDTO.getAddress());
        employee.setUcode(employee.getId()+1000);
        crud.save(employee);
        return "success";
    }

    public List<Employee> readData(){
        return crud.findAll();
    }

    public String deleteData(int id){
        crud.deleteById(id);
        return "Deleted";
    }
}
