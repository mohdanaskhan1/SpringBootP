package com.mainapp13.main;

import com.mainapp13.Entity.Employee;
import com.mainapp13.config.MyConfig;
import com.mainapp13.controller.MyController;
import com.mainapp13.repository.MyResository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launch {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
        Employee empBean = ac.getBean(Employee.class);
        empBean.setEid(1);
        empBean.seteName("ABC");
        empBean.seteAddress("ADD1");
        empBean.seteSalary(1200);

        MyController controllerBean = ac.getBean(MyController.class);
        String res = controllerBean.doPost(empBean);
        System.out.println(res);




    }
}
