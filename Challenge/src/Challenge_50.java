//50 Create a program to find the sum of two diagonal elements..

import java.util.Random;
import java.util.Arrays;

public class Challenge_50 {
    public static void main(String[] args){
        // Create a new Random object for generating numbers
        Random random = new Random();

        // Initialize a 3x3 integer matrix (2D array)
        int[][] arr = new int[3][3];
        int i = 0;
        int bound = 100; // Set the upper bound for random numbers (exclusive)

        // --- Populate and Print the Matrix ---
        // Loop through each row
        while (i < arr.length){
            int j = 0;
            // Loop through each column in the current row
            while(j < arr[i].length){
                // Assign a random integer to the current element
                arr[i][j] = random.nextInt(bound);
                // Print the element followed by a tab
                System.out.print(arr[i][j] + "\t");
                j++;
            }
            // Move to the next line after printing a row
            System.out.println();
            i++;
        }

        // --- Calculate Sum of Diagonal ---
        // Note: This logic is inefficient and confusing. See corrected version below.
        i = 0;
        int sum = 0; // Initialize sum
        // Loop through rows
        while(i < arr.length){
            int j = 0;
            // Loop through columns
            while(j < arr[i].length){
                // This condition is incorrect for finding diagonals.
                // It compares memory addresses of the rows.
                if(arr[i]==arr[j]){
                    sum += arr[i][j];
                }
                j++;
            }
            i++;
        }

        // Print the final calculated sum
        System.out.println("Sum from original code: " + sum);
    }
}
