package com.mainapp13.repository;

import com.mainapp13.Entity.Employee;
import org.springframework.stereotype.Component;

@Component("repo2")
public class MyRepositoryImpl2  implements MyResository{

    @Override
    public String add(Employee empBean) {
        System.out.println(empBean + " saved Successfully");
        return "SUCCESS 2";
    }

}
