package com.mainapp12.test;

import com.mainapp12.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launch {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
        Employee emp1 = (Employee) ac.getBean("employee");
//        System.out.println(emp1);
        emp1.test();

//        Employee emp2 = (Employee) ac.getBean("employee");
//        System.out.println(emp2);
//        emp2.test();


        ac.close();
    }
}
