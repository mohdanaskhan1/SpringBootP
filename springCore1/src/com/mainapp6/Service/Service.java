package com.mainapp6.Service;

import com.mainapp6.Dao.Dao;

public class Service {

    private Dao dao;

    public void setDao(Dao dao) {
        this.dao = dao;
    }

    public void testService(){
        System.out.println("testService");
        dao.testDao();
    }

}
