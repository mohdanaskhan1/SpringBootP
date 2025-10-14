package com.mainapp4;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class EmployeeBean implements InitializingBean, DisposableBean {
    static {
        System.out.println("Employee Bean Loading");
    }
    public EmployeeBean() {
        System.out.println("Employee Bean Initialization");
    }
//    public void xmlInit() {
//        System.out.println("Resource Allocation");
//    }
//    @PostConstruct
//    public void annoInit(){
//        System.out.println("Resource Allocation");
//    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Resource Allocation");
    }

    public void test(){
        System.out.println("Custom Method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Resource Deallocation");
    }


//    public void xmlDestroy() {
//        System.out.println("Resource Deallocation");
//    }
//    @PreDestroy
//    public void annoDestroy(){
//        System.out.println("Resource Deallocation");
//    }
}

