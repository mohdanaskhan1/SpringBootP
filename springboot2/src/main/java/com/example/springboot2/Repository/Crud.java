package com.example.springboot2.Repository;

import com.example.springboot2.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Crud extends JpaRepository<Employee, Integer> {


}
