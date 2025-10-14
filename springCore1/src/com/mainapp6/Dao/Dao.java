package com.mainapp6.Dao;

import javax.annotation.PostConstruct;

public class Dao {

    private String connection;

    @PostConstruct
    public String init(){
        this.connection = "Connection Success";
        return connection;

    }

    public void testDao(){
        System.out.println("testDao : " + connection);
    }
}
