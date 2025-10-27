package com.example.demo.repository;

import com.example.demo.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Modifying
    @Transactional
    @Query("UPDATE Employee e SET e.salary = :salary WHERE e.id = :id")
    int updateEmployee(@Param("salary") BigDecimal salary, @Param("id") Long id);

}
