package com.tns.day3;

public class Person {
    // Data members
    private String name;
    private int income;
    private String gender;
    private int age;
    private int tax;

    // Getter and Setter for tax
    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for income
    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    // Getter and Setter for gender
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Object class method to return string representation of Person object
    @Override
    public String toString() {
        return "Person [name=" + name + ", income=" + income + ", gender=" + gender + ", age=" + age + ", tax=" + tax + "]";
    }
}
