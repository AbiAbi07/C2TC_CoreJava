package com.tns.day3;

public class Encapsulation {
    // Private fields
    private int serialNum;
    private String name;
    private int age;

    // Getter for serialNum
    public int getSerialNum() {
        return serialNum;
    }

    // Setter for serialNum
    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // toString method to return a string representation of the object
    @Override
    public String toString() {
        return "OopsConceptDemo [Serial Number=" + serialNum + ", Name=" + name + ", Age=" + age + "]";
    }
}