package com.example.springboot3.repository;

import com.example.springboot3.dto.StudentDto;
import com.example.springboot3.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Crud extends JpaRepository<Student,Integer> {


}
