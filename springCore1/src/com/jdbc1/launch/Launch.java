package com.jdbc1.launch;

import com.jdbc1.config.MyConfig;
import com.jdbc1.dao.Crud;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.jdbc1.pojo.Employee;

import java.util.Scanner;
public class Launch {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

//        Scanner sc  = new Scanner(System.in);
//        System.out.println("Enter Eid : ");
//        int eid =  sc.nextInt();

        Crud  bean= (Crud) context.getBean("crud",Crud.class);
//        bean.readMyData1();
//        bean.readMyData2();
//        bean.readMyData3(eid);





    }

}
