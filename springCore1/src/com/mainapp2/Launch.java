package com.mainapp2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");


        System.out.println("Raju Account Creation");
        Accounts accounts = (Accounts) ac.getBean("accounts");
        accounts.setUsername("12345");
        accounts.setPassword("ABC123");
        accounts.setFullName("John Doe");
        accounts.setAddress("Main Road");
        System.out.println(accounts);


        System.out.println("Maju Account Creation");
        Accounts accounts2 = (Accounts) ac.getBean("accounts");
        accounts2.setUsername("67890");
        accounts2.setPassword("DEF123");
        accounts2.setFullName("Mohn Doe");
        accounts2.setAddress("Back Road");
        System.out.println(accounts2);


        System.out.println("Both Account Creation");
        System.out.println(accounts);
        System.out.println(accounts2);


    }
}
