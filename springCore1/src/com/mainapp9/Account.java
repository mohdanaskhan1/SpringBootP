package com.mainapp9;

public class Account {
    private int an;
    private String username;

    public Account(int an, String username) {
        this.an = an;
        this.username = username;
    }

    public int getAn() {
        return an;
    }


    public void setAn(int an) {
        this.an = an;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Account{" +
                "an=" + an +
                ", username='" + username + '\'' +
                '}';
    }
}
