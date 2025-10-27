package com.mainapp11;

public class Aadhar {
    private int aadharNo;
    private String aadharName;

    public Aadhar(int aadharNo, String aadharName) {
        this.aadharNo = aadharNo;
        this.aadharName = aadharName;
    }

    public String getAadharName() {
        return aadharName;
    }

    public void setAadharName(String aadharName) {
        this.aadharName = aadharName;
    }

    public int getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(int aadharNo) {
        this.aadharNo = aadharNo;
    }

    @Override
    public String toString() {
        return "Aadhar{" +
                "aadharNo=" + aadharNo +
                ", aadharName='" + aadharName + '\'' +
                '}';
    }
}
