package com.mainapp10;

import java.awt.print.Book;
import java.util.Set;

public class Employee {

    private int eid;
    private String name;
    private int age;

    private Set<String> DefaultSetOfBooks;

    private Set<Account> Accounts;

//    public Employee(Set<Account> accounts) {
//        Accounts = accounts;
//    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Set<String> getDefaultSetOfBooks() {
        return DefaultSetOfBooks;
    }

    public void setDefaultSetOfBooks(Set<String> defaultSetOfBooks) {
        DefaultSetOfBooks = defaultSetOfBooks;
    }

    public Set<Account> getAccounts() {
        return Accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        Accounts = accounts;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", DefaultSetOfBooks=" + DefaultSetOfBooks +
                ", Accounts=" + Accounts +
                '}';
    }
}
