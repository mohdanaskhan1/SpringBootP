package com.mainapp6.Launch;

import com.mainapp6.Controller.Controller;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
    public static void main(String[] args) {

    ClassPathXmlApplicationContext ct = new ClassPathXmlApplicationContext("bean.xml");
    Controller controller = (Controller) ct.getBean("controller");
    controller.getData();

    }


}
