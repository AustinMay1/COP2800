package org.example;

import java.util.Scanner;

public class MonthlyBillTest {
    public static void main(String[] args) {
        int months = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! What is your name: ");

        String name = scanner.nextLine();

        // # of months must be at least 6
        while(months < 6) {
            System.out.printf("Greetings %s. How many months of bills would you like to calculate: ", name);
            months = scanner.nextInt();

            if(months < 6) {
                System.out.println("Number of months be at least 6!");
            }
        }

        double[] billsDue = new double[months];

        System.out.printf("Great! Enter the bill amounts for the next %d months.\n", months);

        // Assigning each index of the array to a bill amount
        while(count <= months - 1) {
            System.out.printf("Month %d\n", count + 1);
            billsDue[count] = scanner.nextDouble();
            count++;
        }

        scanner.close();

        MonthlyBill bills = new MonthlyBill(months, billsDue);

        System.out.printf("Your total amount due: $%.2f\n", bills.calculateAmountDue());
        System.out.printf("Your monthly average: $%.2f\n", bills.calculateMonthlyAvg());
        System.out.printf("See you later %s!", name);
    }
}