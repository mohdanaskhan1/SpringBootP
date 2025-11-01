package com.example.springboot1.repository;

import com.example.springboot1.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CrudJPARepository extends JpaRepository<Employee,Integer> {


    @Query(value = "select * from employee",nativeQuery = true)
    List<Employee> readMyData();

    List<Employee> readById(int id);

//    List<Employee> findById(int id);
    List<Employee> findByName(String name);

    @Transactional
    @Modifying
    @Query(value = "insert into employee(id,name) values(:id, :name)",nativeQuery = true)
    public int insert(@Param("id") int id, @Param("name") String name);


    @Transactional
    @Modifying
    @Query(value = "delete from employee where id=:id",nativeQuery = true)
    public int delete(@Param("id") int id);


    @Transactional
    @Modifying
    @Query(value = "update table employee set name=:name where id=:id", nativeQuery = true)
    public int update(@Param("name") String name, @Param("id") int id);

}


