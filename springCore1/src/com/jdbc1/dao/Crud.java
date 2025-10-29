package com.jdbc1.dao;

import com.jdbc1.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class Crud{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


//    queryForList() - List<Map<String,Object>>
    public void readMyData1(){
        String sql="select * from employee1";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> map : list) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
        }
    }

//    //query() : List<pojo>
    public void readMyData2(){
        String sql="select * from employee1";
        List<Employee> query = jdbcTemplate.query(sql, new RowMapperClassImpl());
        for (Employee e:query){
            System.out.println(e);
        }
    }

    //Query For Object : for single pojo
    public Employee readMyData3(int eid){
        String sql="select * from employee1 where eId=?";
        Employee employee = jdbcTemplate.queryForObject(sql,new RowMapperClassImpl(),eid);
        System.out.println(employee);
        return employee;
    }
}