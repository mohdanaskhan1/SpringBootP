package com.mainapp12.config;


import com.mainapp12.test.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.mainapp12.test", "com.mainapp12.postprocessor"})

public class MyConfig {
//    @Bean
//    public Employee CustomLogic(){
//        return new Employee();
//    }

}
