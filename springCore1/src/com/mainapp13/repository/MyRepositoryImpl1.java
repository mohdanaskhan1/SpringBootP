package com.mainapp13.repository;
import com.mainapp13.Entity.Employee;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("repo1")
public class MyRepositoryImpl1 implements MyResository {

//    @Value("1000")
    @Value("#{2+100}")
    private int testid;

    @Value("Hello")
    private String testString;

    @Value("#{list}")
    private List<String> testList;




    @Override
    public String add(Employee empBean) {
        System.out.println(empBean + " saved Successfully   " + testid + " " + testString + " " + testList);
        return "SUCCESS 1";
    }
}
