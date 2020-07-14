package com.company;

public class Person {
    private String firstname;
    private String lastname;
    private int age;

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
