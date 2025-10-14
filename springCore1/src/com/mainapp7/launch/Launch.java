package com.mainapp7.launch;

import com.mainapp7.client.Client;
import com.mainapp7.employee.Employee;
import com.mainapp7.student.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Employee employee = (Employee) context.getBean("employee");
        employee.setEid(22);
        employee.setEname("Raju");
        System.out.println(employee);

        Client client = (Client) context.getBean("client");
        client.setCid(23);
        client.setCname("Kaju");
        System.out.println(client);

        Student student = (Student) context.getBean("student");
        student.setStId(24);
        student.setStName("Maju");
        System.out.println(student);

    }
}
