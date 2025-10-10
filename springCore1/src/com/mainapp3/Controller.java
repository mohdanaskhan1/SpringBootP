package com.mainapp3;

public class Controller {

    private Service service;

    public void setService(Service service) {
        this.service = service;
    }


    public void doPost(){
        System.out.println("Do Post");
        service.test1();
    }

    public void doGet(){
        System.out.println("Do Get");
        service.test2();
    }
}
