package com.mainapp13.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;


@Configuration
@ComponentScan(basePackages = {"com.mainapp13.Entity","com.mainapp13.controller","com.mainapp13.service","com.mainapp13.repository"})
public class MyConfig {

    @Bean
    public List<String> list() {
        return Arrays.asList("JAVA1","JAVA2");
    }

}
