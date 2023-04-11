package org.example;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        setFirstName(firstName);
        setLastName(lastName);
        setMonthlySalary(monthlySalary);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
            if(monthlySalary > 0) {
                this.monthlySalary = monthlySalary;
            }
    }

    public double getYearlySalary() { return monthlySalary * 12; }

    public void giveRaise(double amount) {
        double raiseAmount = amount * getMonthlySalary();
        this.monthlySalary = getMonthlySalary() + raiseAmount;
    }
}
