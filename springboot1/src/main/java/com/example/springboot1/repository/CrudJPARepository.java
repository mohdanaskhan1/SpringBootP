package com.example.springboot1.repository;

import com.example.springboot1.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CrudJPARepository extends JpaRepository<Employee,Integer> {


    @Query(value = "select * from employee",nativeQuery = true)
    List<Employee> readMyData();

    List<Employee> readById(int id);

//    List<Employee> findById(int id);
    List<Employee> findByName(String name);
}
