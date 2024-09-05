package com.tns.day3;

import java.util.Scanner;

public class PersonDemo {
    public static void main(String[] args) {
        // Scanner object to accept user inputs
        Scanner ob = new Scanner(System.in);

        // Accepting user inputs
        System.out.println("Enter Person Name: ");
        String name = ob.nextLine(); // Use nextLine() to read the entire line

        System.out.println("Enter age: ");
        int age = ob.nextInt();

        System.out.println("Enter gender: ");
        String gender = ob.next();

        System.out.println("Enter taxable income: ");
        int income = ob.nextInt();

        // Person object and initialize values using setter
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        person.setGender(gender);
        person.setIncome(income);

        // Display person details using toString() method
        System.out.println("Person Details: ");
        System.out.println(person);

        // Tax calculation
        TaxCalculation calc = new TaxCalculation();
        calc.calculateTax(person);

        // Display person details after tax calculation
        System.out.println("After calculating tax: ");
        System.out.println(person);

        // Close the scanner
        ob.close();
    }
}

