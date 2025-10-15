package com.mainapp9;

import com.mainapp9.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Employee employee = (Employee) context.getBean("employee");
        employee.setEid(121);
        employee.setEname("RAJU");
        employee.setEaddress("KK");
        System.out.println(employee);
        System.out.println(employee.getDefaultListOfAccount().getClass());
    }
}
