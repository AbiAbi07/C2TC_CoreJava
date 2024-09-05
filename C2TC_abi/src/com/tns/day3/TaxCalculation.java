package com.tns.day3;

public class TaxCalculation {
    // Function to calculate tax
    public void calculateTax(Person person) {
        // Check for senior citizens or females where tax is not applicable
        if (person.getAge() > 65 || person.getGender().equalsIgnoreCase("female")) {
            person.setTax(0);
            System.out.println("Tax not applicable");
        } else {
            // Calculate tax based on income
            if (person.getIncome() <= 160000) {
                person.setTax(0);
            } else if (person.getIncome() > 160000 && person.getIncome() <= 500000) {
                person.setTax((person.getIncome() - 160000) * 10 / 100);
            } else if (person.getIncome() > 500000 && person.getIncome() <= 800000) {
                person.setTax((person.getIncome() - 500000) * 20 / 100 + 34000);
            } else {
                person.setTax((person.getIncome() - 800000) * 30 / 100 + 94000);
            }
        }
    }
}
