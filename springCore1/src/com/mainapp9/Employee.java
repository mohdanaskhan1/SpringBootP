package com.mainapp9;

import java.util.List;

public class Employee {
    private int Eid;
    private String Ename;
    private String Eaddress;

    private List<Account> defaultListOfAccount;

    public Employee() {
    }

    public Employee(List<Account> defaultListOfAccount) {
        this.defaultListOfAccount = defaultListOfAccount;
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

    public List<Account> getDefaultListOfAccount() {
        return defaultListOfAccount;
    }

    public void setDefaultListOfAccount(List<Account> defaultListOfAccount) {
        this.defaultListOfAccount = defaultListOfAccount;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Eid=" + Eid +
                ", Ename='" + Ename + '\'' +
                ", Eaddress='" + Eaddress + '\'' +
                ", defaultListOfAccount=" + defaultListOfAccount +
                '}';
    }
}