package com.mainapp5;


import java.util.Scanner;

public class EmployeeBean {

    private String ComapanyCode;

    static {
        System.out.println("Employee Bean Loading");
    }

    public EmployeeBean(String ComapanyCode) {
        this.ComapanyCode = ComapanyCode;
        System.out.println("Employee Bean Initialization");
    }

    public void test() {
        System.out.println("Custom Method : " + this.ComapanyCode);
    }

//    public static EmployeeBean customLogic(){
//        EmployeeBean eb;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Employee Code : ");
//        int empCode = sc.nextInt();
//        if (empCode == 1212){
//            eb = new EmployeeBean("QWERTY");
//        }
//        else{
//            eb  = new EmployeeBean("ABCDE");
//        }
//        return eb;
//    }

}

