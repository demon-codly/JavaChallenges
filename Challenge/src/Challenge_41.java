//41. Create a program to find number of occurrences of an element in an array.

import java.util.Random;
import java.util.Scanner;

public class Challenge_41 {
    public static void main(String[] args){
        // Create objects for user input and random number generation.
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // --- Generate and display an array of random numbers ---
        System.out.println("Please see the numbers in the array list:");
        int[] myArr = new int[15]; // The array to be filled.
        int bound = 100; // Random numbers will be from 0 to 99.

        int i = 0;
        // Loop through the array to fill it with random numbers.
        while (i < myArr.length){
            myArr[i] = random.nextInt(bound); // Assign a random number.
            System.out.print(myArr[i] + " "); // Print the number immediately.
            i++;
        }
        System.out.println(); // Move to the next line for clean output.

        // --- Get the number to find from the user ---
        // Using an array of size 1 to store the target number, as in the original logic.
        int[] arr = new int[1]; 
        System.out.print("Enter the number you want to find: ");
        arr[0] = input.nextInt(); // Read user input into the array's only element.

        // --- Count the occurrences of the number ---
        int count = 0; // Initialize a counter for occurrences.
        
        // Reset the loop counter to 0 to iterate through the array again.
        i = 0; 
        
        // Loop through the array to find matching numbers.
        while(i < myArr.length){
            // Check if the current element matches the user's number.
            if(myArr[i] == arr[0]){
                count++; // If it matches, increment the counter.
            }
            i++;
        }
        
        // --- Display the final result ---
        System.out.printf("The number %d occurred %d time(s).\n", arr[0], count);

        // Close the scanner to prevent resource leaks.
        input.close();
    }
}
