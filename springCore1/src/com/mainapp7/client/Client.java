package com.mainapp7.client;

public class Client {

    private int CountryCode;
    private String CountryName;
    private String Policy;

    private int Cid;
    private String Cname;

    public Client() {

    }

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

    public int getCid() {
        return Cid;
    }

    public void setCid(int cid) {
        Cid = cid;
    }

    public String getCname() {
        return Cname;
    }

    public void setCname(String cname) {
        Cname = cname;
    }


    @Override
    public String toString() {
        return "Client{" +
                "CountryCode=" + CountryCode +
                ", CountryName='" + CountryName + '\'' +
                ", Policy='" + Policy + '\'' +
                ", Cid=" + Cid +
                ", Cname='" + Cname + '\'' +
                '}';
    }
}
