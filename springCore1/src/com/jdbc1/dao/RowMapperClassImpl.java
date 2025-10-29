package com.jdbc1.dao;

import javax.swing.tree.TreePath;

import com.jdbc1.pojo.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperClassImpl implements RowMapper<Employee> {
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee employee = new Employee();
        employee.seteId(rs.getInt("eid"));
        employee.seteName(rs.getString("ename"));

        return employee;
    }
}
