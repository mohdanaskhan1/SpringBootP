package com.mainapp13.Entity;


import org.springframework.stereotype.Component;

@Component
public class Employee {
    private int eid;
    private String eName;
    private String eAddress;
    private int eSalary;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String geteAddress() {
        return eAddress;
    }

    public void seteAddress(String eAddress) {
        this.eAddress = eAddress;
    }

    public int geteSalary() {
        return eSalary;
    }

    public void seteSalary(int eSalary) {
        this.eSalary = eSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", eName='" + eName + '\'' +
                ", eAddress='" + eAddress + '\'' +
                ", eSalary=" + eSalary +
                '}';
    }
}
