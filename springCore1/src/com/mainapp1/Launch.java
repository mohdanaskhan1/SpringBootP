package com.mainapp1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
    public static void main(String[] args) {
//        ClassPathResource resource = new ClassPathResource("bean.xml");
//        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resource);

//        Demo demo = (Demo) xmlBeanFactory.getBean("demo");
//        demo.test();
//
//        Femo femo = (Femo) xmlBeanFactory.getBean("femo");
//        femo.test();


        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        Demo demo = (Demo) ac.getBean("demo");
        int a = demo.test();
        if(a==111) {
            Femo femo = (Femo) ac.getBean("femo");
            femo.test();
        }

        System.out.println("Exit");







    }
}