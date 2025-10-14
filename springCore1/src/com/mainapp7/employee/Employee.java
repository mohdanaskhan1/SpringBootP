package com.mainapp7.employee;

public class Employee {
    private int CountryCode;
    private String CountryName;
    private String Policy;

    private int eid;
    private String ename;

    public int getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(int countryCode) {
        CountryCode = countryCode;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String countryName) {
        CountryName = countryName;
    }

    public String getPolicy() {
        return Policy;
    }

    public void setPolicy(String policy) {
        Policy = policy;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Employee() {

    }

    @Override
    public String toString() {
        return "Employee{" +
                "CountryCode=" + CountryCode +
                ", CountryName='" + CountryName + '\'' +
                ", Policy='" + Policy + '\'' +
                ", eid=" + eid +
                ", ename='" + ename + '\'' +
                '}';
    }
}
