package com.mainapp8;

import java.util.List;

public class Employee {

    private int Eid;
    private String Ename;
    private String Eaddress;

    private List<String> defaultListOfBooks;  //Dependency


    public List<String> getDefaultListOfBooks() {
        return defaultListOfBooks;
    }

    public void setDefaultListOfBooks(List<String> defaultListOfBooks) {
        this.defaultListOfBooks = defaultListOfBooks;
    }

    public Employee(List<String> defaultListOfBooks) {
        this.defaultListOfBooks = defaultListOfBooks;
    }

    public int getEid() {
        return Eid;
    }

    public void setEid(int eid) {
        Eid = eid;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String ename) {
        Ename = ename;
    }

    public String getEaddress() {
        return Eaddress;
    }

    public void setEaddress(String eaddress) {
        Eaddress = eaddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Eid=" + Eid +
                ", Ename='" + Ename + '\'' +
                ", Eaddress='" + Eaddress + '\'' +
                ", defaultListOfBooks=" + defaultListOfBooks +
                '}';
    }
}
