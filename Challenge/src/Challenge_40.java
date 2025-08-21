//40. Create a program to find the sum and average of all elements in an array.

import java.util.Scanner;
import java.util.Arrays; // This import is not used, can be removed.

public class Challenge_40 {
    // Main method - program entry point.
    public static void main(String[] args) {
        // Create a Scanner object to handle user input.
        Scanner input = new Scanner(System.in);
        
        // Get the desired array size from the user.
        System.out.print("Enter the number of elements in the array: ");
        int size = input.nextInt();
        
        // Initialize the array with the specified size.
        int[] arr = new int[size];

        // Declare a counter for the loops.
        int i = 0;
        
        // Use a while loop to get each element from the user.
        while(i < arr.length){
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
            i++;
        }
        
        // --- Calculate the sum of all elements ---
        int sum = 0;
        
        // Reset the counter to 0 to iterate through the array again.
        i = 0; 
        
        // Loop through the array to add each element to the sum.
        while(i < arr.length){
            sum += arr[i];
            i++;
        }

        // --- Calculate the average ---
        // Note: This performs integer division. For a decimal result, use: (float) sum / size;
        float average = sum / size;

        // Print the results using formatted strings.
        System.out.printf("The total sum of all the given numbers is %d\n", sum);
        System.out.printf("The average of all the given numbers is %f", average);
        
        // Close the scanner to prevent resource leaks.
        input.close();
    }
}
