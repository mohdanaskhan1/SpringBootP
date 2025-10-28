package com.mainapp13.controller;

import com.mainapp13.Entity.Employee;
import com.mainapp13.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyController {

    @Autowired
    private MyService myService;

    public String doPost(Employee empBean) {
        return myService.add(empBean);
    }

}
