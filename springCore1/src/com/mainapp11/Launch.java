package com.mainapp11;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Employee employee = (Employee) context.getBean("employee");
        employee.setId(1);
        employee.setName("Rahul");
        employee.setAddress("ABC");
        System.out.println(employee);
    }   
}

