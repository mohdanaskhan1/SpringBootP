package com.example.springboot1;

import com.example.springboot1.entity.Employee;
import com.example.springboot1.repository.CrudJPARepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Springboot1Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Springboot1Application.class, args);
        System.out.println("Hello");

//        Employee employee = new Employee(11, "soham");
////        Crud bean = run.getBean(Crud.class);
////        bean.raju(employee);
//
//        CrudJPARepository repo = run.getBean(CrudJPARepository.class);
//        repo.save(employee);
//
//        System.out.println("Employee saved: " + employee);

        CrudJPARepository bean = run.getBean(CrudJPARepository.class);
//        bean.readMyData().forEach(System.out::println);

//        bean.readById(10).forEach(System.out::println);

//        bean.findByName("Soham").forEach(System.out::println);
//        bean.findById(11).forEach(System.out::println);

//        Employee employee = new Employee(15, "Dinesh");
//        bean.save(employee);
//        System.out.println("Saved Employee");

//        Optional<Employee> byId = bean.findById(13);
//        if(byId.isPresent()) {
//            Employee employee = byId.get();
//            employee.setName("Rahul");
//            bean.save(employee);
//            System.out.println("Updated");
//        }

//        bean.deleteById(13);
//        System.out.println("Deleted");
//        bean.findAll().forEach(System.out::println);


//        bean.findAll(Sort.by("id").descending()).forEach(System.out::println);

//        Page<Employee> all = bean.findAll(PageRequest.of(0, 2));
//        System.out.println(all.getTotalElements());
//        System.out.println(all.getTotalPages());
//        System.out.println(all.getNumber());
//        System.out.println(all.getSize());
//        List<Employee> content = all.getContent();
//        content.forEach(System.out::println);


//        bean.insert(16,"Ram");
//        System.out.println("Updated");

//        bean.delete(13);
//        System.out.println("Deleted");

//        bean.update("Rahim",12);
//        System.out.println("Updated");



    }
}
