package com.mainapp11;

import java.util.List;

public class Employee {

    private int id;
    private String name;
    private String address;

    //IOC
    private Account account;
    private Aadhar aadhar;
    private List<String> listofbooks;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Aadhar getAadhar() {
        return aadhar;
    }

    public void setAadhar(Aadhar aadhar) {
        this.aadhar = aadhar;
    }

    public List<String> getListofbooks() {
        return listofbooks;
    }

    public void setListofbooks(List<String> listofbooks) {
        this.listofbooks = listofbooks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", account=" + account +
                ", aadhar=" + aadhar +
                ", listofbooks=" + listofbooks +
                '}';
    }
}
