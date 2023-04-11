package org.example;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp_1 = new Employee("Mike", "Jones", 3500);
        Employee emp_2 = new Employee("John", "Doe", 4000);
        Employee emp_3 = new Employee("Jane", "Smith", 3800);
        Employee emp_4 = new Employee("Jerry", "Seinfeld", 4200);
        Employee emp_5 = new Employee("Jeniffer", "Anniston", 6000);

        System.out.println("==========Employees==========");

        System.out.printf("First Name: %s , Last Name: %s, Yearly Salary: $%.2f\n", emp_1.getFirstName(), emp_1.getLastName(), emp_1.getYearlySalary());
        System.out.printf("First Name: %s , Last Name: %s, Yearly Salary: $%.2f\n", emp_2.getFirstName(), emp_2.getLastName(), emp_2.getYearlySalary());
        System.out.printf("First Name: %s , Last Name: %s, Yearly Salary: $%.2f\n", emp_3.getFirstName(), emp_3.getLastName(), emp_3.getYearlySalary());
        System.out.printf("First Name: %s , Last Name: %s, Yearly Salary: $%.2f\n", emp_4.getFirstName(), emp_4.getLastName(), emp_4.getYearlySalary());
        System.out.printf("First Name: %s , Last Name: %s, Yearly Salary: $%.2f\n", emp_5.getFirstName(), emp_5.getLastName(), emp_5.getYearlySalary());

        Scanner scanner = new Scanner(System.in);
        double pct; // raise percentage

        System.out.println("\nLets give some raises! Enter a raise amount between 0.02-0.06 for each employee.\n");

        System.out.printf("Enter a raise amount for %s: ", emp_1.getFirstName());
        pct = scanner.nextDouble();
        emp_1.giveRaise(pct);
        System.out.printf("%s's new yearly salary: $%.2f\n", emp_1.getFirstName(), emp_1.getYearlySalary());

        System.out.printf("\nEnter a raise amount for %s: ", emp_2.getFirstName());
        pct = scanner.nextDouble();
        emp_2.giveRaise(pct);
        System.out.printf("%s's new yearly salary: $%.2f\n", emp_2.getFirstName(), emp_2.getYearlySalary());

        System.out.printf("\nEnter a raise amount for %s: ", emp_3.getFirstName());
        pct = scanner.nextDouble();
        emp_3.giveRaise(pct);
        System.out.printf("%s's new yearly salary: $%.2f\n", emp_3.getFirstName(), emp_3.getYearlySalary());

        System.out.printf("\nEnter a raise amount for %s: ", emp_4.getFirstName());
        pct = scanner.nextDouble();
        emp_4.giveRaise(pct);
        System.out.printf("%s's new yearly salary: $%.2f\n", emp_4.getFirstName(), emp_4.getYearlySalary());

        System.out.printf("\nEnter a raise amount for %s: ", emp_5.getFirstName());
        pct = scanner.nextDouble();
        emp_5.giveRaise(pct);
        System.out.printf("%s's new yearly salary: $%.2f\n", emp_5.getFirstName(), emp_5.getYearlySalary());

        scanner.close();

        System.out.println("\nWay to go! Here is a summary of your changes:\n");

        System.out.printf("First Name: %s , Last Name: %s, Yearly Salary: $%.2f\n", emp_1.getFirstName(), emp_1.getLastName(), emp_1.getYearlySalary());
        System.out.printf("First Name: %s , Last Name: %s, Yearly Salary: $%.2f\n", emp_2.getFirstName(), emp_2.getLastName(), emp_2.getYearlySalary());
        System.out.printf("First Name: %s , Last Name: %s, Yearly Salary: $%.2f\n", emp_3.getFirstName(), emp_3.getLastName(), emp_3.getYearlySalary());
        System.out.printf("First Name: %s , Last Name: %s, Yearly Salary: $%.2f\n", emp_4.getFirstName(), emp_4.getLastName(), emp_4.getYearlySalary());
        System.out.printf("First Name: %s , Last Name: %s, Yearly Salary: $%.2f\n", emp_5.getFirstName(), emp_5.getLastName(), emp_5.getYearlySalary());

        System.out.println("\nHave a nice day!");
    }
}