//36.Create a program to print the Fibonacci series up to a certain number.

import java.util.Scanner; // Import the Scanner class for user input

public class Challenge_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object to take user input

        System.out.println("The Fibonacci series up to a given number....\n");
        System.out.print("Enter a Number: ");
        int num = input.nextInt(); // Read the input number from user

        System.out.println("The Fibonacci series is ");
        fibonacci(num); // Call the fibonacci method to generate and print the series
    }

    public static void fibonacci(int num) {
        // Handle cases where input is negative or 0
        if (num < 0){
            System.out.print("0 ");
        }
        else if (num == 0) {
            System.out.print("1 ");
        }

        int first = 0, second = 1; // First two numbers of the Fibonacci series

        // Print first two numbers (optional, since your loop doesn't include 0 and 1)
        System.out.print(first + " " + second + " ");

        // Iteration Table:
        // | Iteration | first | second | third = first + second | Output |
        // |-----------|--------|--------|-------------------------|--------|
        // | 1         | 0      | 1      | 1                       | 1      |
        // | 2         | 1      | 1      | 2                       | 2      |
        // | 3         | 1      | 2      | 3                       | 3      |
        // | 4         | 2      | 3      | 5                       | 5      |
        // | 5         | 3      | 5      | 8                       | 8      |
        // | 6         | 5      | 8      | 13                      | 13     |
        // | 7         | 8      | 13     | 21                      | 21     |
        // (loop ends when third >= num)

        while (first + second < num) {
            int third = first + second; // Calculate next number in the series
            System.out.print(third + " "); // Print the next number
            first = second;   // Shift second number to first
            second = third;   // Shift third number to second
        }
    }
}
