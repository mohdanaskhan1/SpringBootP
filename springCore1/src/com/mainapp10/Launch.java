package com.mainapp10;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Employee employee = (Employee) context.getBean("employee");
        employee.setEid(121);
        employee.setName("Daniel");
        employee.setAge(18);
        System.out.println(employee);
        System.out.println(employee.getDefaultSetOfBooks() + " -  " + employee.getDefaultSetOfBooks().getClass());
        System.out.println(employee.getAccounts() + " -  " + employee.getAccounts().getClass());

        System.out.println(employee.getDefaultMapOfAuthors()  + " -  " + employee.getDefaultMapOfAuthors().getClass());
        System.out.println(employee.getAuthor() + " - " + employee.getAuthor().getClass());



    }
}
