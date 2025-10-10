package com.mainapp1;

public class Demo {

    static{
        System.out.println("Demo Bean Loading");
    }

    public Demo() {
        System.out.println("Demo Bean Initialization");
    }

    public int test(){
        System.out.println("Demo Test Done");
        return 111;
    }

}
