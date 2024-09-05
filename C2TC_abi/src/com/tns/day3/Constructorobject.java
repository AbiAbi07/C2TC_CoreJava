//Program to demonstrate creating objects with constructors 
package com.tns.day3;

import java.util.Scanner;

public class Constructorobject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, city;
        int id;

        // First customer with default constructor
        System.out.print("Enter Customer Id: ");
        id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Customer Name: ");
        name = sc.nextLine();
        System.out.print("Enter Customer City: ");
        city = sc.nextLine();
        System.out.println();

        Customer c1 = new Customer(); 
        c1.setCustomerName(name);
        c1.setCustomerId(id);
        c1.setCustomerCity(city);
        System.out.println("Customer created with default constructor:");
        System.out.println(c1);

        // Second customer with parameterized constructor
        System.out.print("\nEnter Customer Id: ");
        id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Customer Name: ");
        name = sc.nextLine();
        System.out.print("Enter Customer City: ");
        city = sc.nextLine();

        Customer c2 = new Customer(name, id, city); 
        // Parameterized constructor invoked
        System.out.println("\nCustomer created with parameterized constructor:");
        System.out.println(c2);

        sc.close();
    }
}