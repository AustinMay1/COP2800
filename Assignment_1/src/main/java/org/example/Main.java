package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numOne;
        int numTwo;
        int numThree;
        int numFour;
        int max;
        int min;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! Enter 4 numbers below and the program will calculate your max/min!");

        System.out.println("Please enter your first number: ");
        numOne = scanner.nextInt();
        
        System.out.println("Please enter your second number: ");
        numTwo = scanner.nextInt();
        
        System.out.println("Please enter your third number: ");
        numThree = scanner.nextInt();

        System.out.println("Please enter your fourth number: ");
        numFour = scanner.nextInt();
        
        scanner.close();

        // find max
        if (numOne > numTwo && numOne > numThree && numOne > numFour) 
        {
            max = numOne;
        } 
        else if (numTwo > numOne && numTwo > numThree && numTwo > numFour) 
        {
            max = numTwo;
        }
        else if (numThree > numOne && numThree > numTwo && numThree > numFour)
        {
            max = numThree;
        }
        else
        {
            max = numFour;
        }

        // find min
        if (numOne < numTwo && numOne < numThree && numOne < numFour)
        {
            min = numOne;
        }
        else if (numTwo < numOne && numTwo < numThree && numTwo < numFour)
        {
            min = numTwo;
        }
        else if (numThree < numOne && numThree < numTwo && numThree < numFour)
        {
            min = numThree;
        }
        else
        {
            min = numFour;
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        System.out.println("\nHave a good day!");
    }
}