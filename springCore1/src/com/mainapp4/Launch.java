package com.mainapp4;

import com.mainapp3.Controller;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        EmployeeBean empB = (EmployeeBean) context.getBean("employeeBean");
        empB.test();

        EmployeeBean empB1 = (EmployeeBean) context.getBean("employeeBean");
        empB1.test();


        context.close();

    }
}
