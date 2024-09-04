package com.tns.day2;

public class Condition {

    public static void main(String[] args) {
        int num = 7;

        // if statement
        if (num > 0) {
            System.out.println("Number is positive");
        }

        // if-else statement
        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        // nested if statement
        if (num > 0) {
            if (num < 10) {
                System.out.println("Number is a single digit positive number");
            }
        }

        // if-else if-else statement
        if (num > 0) {
            System.out.println("Number is positive");
        } else if (num < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

        // switch-case statement
        int day = 3;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        System.out.println("Day of the week: " + dayName);

        // Using break statement in a loop
        System.out.println("Using break statement:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; 
            }
            System.out.println("i = " + i);
        }

        // Using continue statement in a loop
        System.out.println("Using continue statement:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;  
            }
            System.out.println("i = " + i);
        }
    }
}
