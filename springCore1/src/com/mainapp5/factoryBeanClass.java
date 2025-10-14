package com.mainapp5;

import java.util.Scanner;

public class factoryBeanClass {
    public EmployeeBean customLogic(){
        EmployeeBean eb;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Code : ");
        int empCode = sc.nextInt();
        if (empCode == 1212){
            eb = new EmployeeBean("QWERTY");
        }
        else{
            eb  = new EmployeeBean("ABCDE");
        }
        return eb;
    }
}
