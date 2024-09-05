package com.tns.day3;

public class Customer {
    private String customerName;
    private int customerId;
    private String customerCity;

    // Default Constructor
    public Customer() {
        System.out.println("Default Constructor");
    }

    // Parameterized Constructor
    // Uses 'this()' to call the default constructor
    public Customer(String customerName, int customerId, String customerCity) {
        this(); // Calls the default constructor
        System.out.println("Parameterized Constructor");
        this.customerName = customerName;
        this.customerId = customerId;
        this.customerCity = customerCity;
    }

    // Getter for customerName
    public String getCustomerName() {
        return customerName;
    }

    // Setter for customerName
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    // Getter for customerId
    public int getCustomerId() {
        return customerId;
    }

    // Setter for customerId
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    // Getter for customerCity
    public String getCustomerCity() {
        return customerCity;
    }

    // Setter for customerCity
    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    // toString method to display customer details
    @Override
    public String toString() {
        return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customerCity=" + customerCity + "]";
    }
}
