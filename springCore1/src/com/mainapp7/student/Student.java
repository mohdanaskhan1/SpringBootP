package com.mainapp7.student;

public class Student {
    private int CountryCode;
    private String CountryName;
    private String Policy;

    private int stId;
    private String stName;

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

    public int getStId() {
        return stId;
    }

    public void setStId(int stId) {
        this.stId = stId;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "CountryCode=" + CountryCode +
                ", CountryName='" + CountryName + '\'' +
                ", Policy='" + Policy + '\'' +
                ", stId=" + stId +
                ", stName='" + stName + '\'' +
                '}';
    }
}
