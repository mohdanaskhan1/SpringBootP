package com.mainapp6.Controller;

import com.mainapp6.Service.Service;

public class Controller {

    private Service service;

    public void setService(Service service) {
        this.service = service;
    }

    public void getData(){
        System.out.println("Controller");
        service.testService();
    }
}
