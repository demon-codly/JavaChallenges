//35.Create a program to reverse the digits of a number.

import java.util.Scanner; // Import Scanner class for user input

public class Challenge_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object to read input

        System.out.println("Program to reverse the digits of a number.....");
        System.out.print("Enter the Number: ");
        int num = input.nextInt(); // Read an integer from the user

        int reserve = reserve(num); // Call the method to reverse the number
        System.out.println("The reserve of the given number is " + reserve); // Print the result
    }

    // Method to reverse the digits of a number
    public static int reserve(int num) {
        int newNum = 0; // This will store the reversed number

        // Iteration Process:
        // | Iteration | num  | digit = num % 10 | newNum = newNum * 10 + digit  | num = num / 10 |
        // |-----------|------|------------------|-------------------------------|----------------|
        // | 1         | 1234 | 4                | 0 * 10 + 4 = 4                | 123            |
        // | 2         | 123  | 3                | 4 * 10 + 3 = 43               | 12             |
        // | 3         | 12   | 2                | 43 * 10 + 2 = 432             | 1              |
        // | 4         | 1    | 1                | 432 * 10 + 1 = 4321           | 0              |

        while (num != 0) {
            int digit = num % 10; // Extract the last digit
            newNum = newNum * 10 + digit; // Append digit to the reversed number
            num /= 10; // Remove the last digit from the original number
        }

        return newNum; // Return the reversed number
    }
}
