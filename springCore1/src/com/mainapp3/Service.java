package com.mainapp3;

public class Service {

    private DAO dao;//dependency

//    public void setDao(Dao Dao) {
//        this.Dao = Dao;
//    }

    public Service(DAO dao) {
        this.dao = dao;
    }

    public void test1(){
        System.out.println("Service 1 called");
        dao.test1();
    }

    public void test2(){
        System.out.println("service 2 called");
        dao.test2();
    }
}
