//13.Create a program to calculate Compound interest.
// Compound Interest = P(1 + R/100)t

import java.util.Scanner;

public class Challenge_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Compound Interest Calculator ===");

        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the time period (in years): ");
        double time = input.nextDouble();

        System.out.print("Enter the annual interest rate (in %): ");
        double rate = input.nextDouble();

        //formula
        double ci = principal * (1 + rate/100) * time;

        //final print statement
        System.out.printf("The compound interest is %.2f%n",ci);
    }
}
