package com.mainapp12.test;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Lazy
//@Scope(scopeName = "prototype")
//@Scope("prototype")
public class Employee {
    static {
        System.out.println("Bean Loading");
    }

    public Employee() {
        System.out.println("Bean Instatiation");
    }
    @PostConstruct
    public void init(){
        System.out.println("Bean Init");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Bean Destroy");
    }
    public void test(){
        System.out.println("Method Called");
    }

    @Override
    public String toString() {
        return "Employee{}";
    }
}
