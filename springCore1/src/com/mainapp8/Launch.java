package com.mainapp8;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Employee employee = (Employee) context.getBean("employee");
        employee.setEid(101);
        employee.setEname("Daniel");
        employee.setEaddress("123");
        System.out.println(employee);
        System.out.println(employee.getDefaultListOfBooks().getClass());
    }
}
