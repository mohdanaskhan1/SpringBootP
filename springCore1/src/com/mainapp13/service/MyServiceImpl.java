package com.mainapp13.service;

import com.mainapp13.Entity.Employee;
import com.mainapp13.repository.MyResository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyServiceImpl implements MyService {

//    @Autowired //Field Injection
//    @Qualifier("repo1")
//    private MyResository myResository;


//    private MyResository myResository; //Constructor Injection
//
//    public MyServiceImpl(@Qualifier("repo1") MyResository myResository) {
//        System.out.println("Constructor Injection");
//        this.myResository = myResository;
//    }


    private MyResository myResository;
    @Autowired //Field Injection
    @Qualifier("repo1")
    public void setMyResository(MyResository myResository) {
        System.out.println("Setter Injection");
        this.myResository = myResository;
    }

    @Override
    public String add(Employee empBean) {
        return myResository.add(empBean);
    }
}
