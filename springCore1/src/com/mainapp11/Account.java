package com.mainapp11;

public class Account {

    private int an;
    private String aName;

    public Account(int an, String aName) {
        this.an = an;
        this.aName = aName;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "an=" + an +
                ", aName='" + aName + '\'' +
                '}';
    }
}
