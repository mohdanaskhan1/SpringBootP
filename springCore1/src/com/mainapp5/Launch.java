package com.mainapp5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        EmployeeBean eb = (EmployeeBean) context.getBean("employeeBean");
        eb.test();


    }
}

