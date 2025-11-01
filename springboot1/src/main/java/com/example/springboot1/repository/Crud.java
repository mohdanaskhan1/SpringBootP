package com.example.springboot1.repository;


import com.example.springboot1.entity.Employee;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class Crud {

    @Autowired
    private EntityManager entityManager;


    @Transactional
    public void raju(Employee employee){
        entityManager.persist(employee);
    }
}
