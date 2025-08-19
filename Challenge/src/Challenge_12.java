/*
12. Create a program to calculate simple interest.
Simple Interest = (P x T x R)/100
 */

import java.util.Scanner;

public class Challenge_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Simple Interest Calculator ===");

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in %): ");
        double rate = scanner.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principal * time * rate) / 100;

        System.out.printf("Simple Interest = %.2f%n", simpleInterest);

        scanner.close();
    }
}
