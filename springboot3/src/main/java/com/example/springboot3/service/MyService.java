package com.example.springboot3.service;

import com.example.springboot3.dto.StudentDto;
import com.example.springboot3.entity.Student;
import com.example.springboot3.repository.Crud;

import java.util.List;

public interface MyService {

    public List<Student> readData();

    public String insertData(StudentDto studentDto);

    public String DeleteById(int id);

    public Student UpdateAll(int id, StudentDto studentdto);

}
