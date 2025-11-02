package com.example.springboot3.repository;

import com.example.springboot3.entity.Employees;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employees, Long> {


    @Transactional
    @Modifying
    @Query("UPDATE Employees e SET e.salary=:newSalary WHERE e.id=:id")
    int updateSalary(@Param("newSalary") BigDecimal newSalary, @Param("id") Long id);

    @Modifying
    @Transactional
    @Query("UPDATE Employees e SET e.salary=:salary , e.department=:dept WHERE e.id=:id")
    int UpdateSalaryDepartment(@Param("salary") BigDecimal salary, @Param("dept") String department, @Param("id") Long id);

    List<Employees> findEmployeesByCityIgnoreCase(String city);


    List<Employees> findEmployeesBySalaryGreaterThan(BigDecimal salaryIsGreaterThan);
}
