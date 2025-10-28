package org.example;

public class Student {
    int studentId;
    private  String firstName;
    private String lastName;
    private String Address;

    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public Student(int studentId, String firstName, String lastName, String address) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Address = address;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return Address;
    }
}