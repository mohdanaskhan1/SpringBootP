package com.mainapp4;

public class EmployeeBean {
    static {
        System.out.println("Employee Bean Loading");
    }
    public EmployeeBean() {
        System.out.println("Employee Bean Initialization");
    }
    public void xmlInit() {
        System.out.println("Resource Allocation");
    }
    public void test(){
        System.out.println("Custom Method");
    }
    public void xmlDestroy() {
        System.out.println("Resource Deallocation");
    }
}

