//43. Create a program to check if the given array is sorted.

import java.util.Random;
import java.util.Arrays; // Used for sorting and printing the array.

public class Challenge_43 {
    // The main method where the program starts.
    public static void main(String[] args){
        // Create objects for random number generation.
        Random random = new Random();

        // Initialize an integer array of size 10.
        int[] arr = new int[10];

        // --- Fill the array with random numbers ---
        int i = 0;
        int bound = 100; // Numbers will be from 0 to 99.
        while(i < arr.length){
            arr[i] = random.nextInt(bound);
            i++;
        }

        // --- Test the isSorted method ---
        // Sort the array first so we can confirm our method works correctly.
        Arrays.sort(arr);
        System.out.println("Checking array: " + Arrays.toString(arr));

        // Call the isSorted method and store the true/false result.
        boolean isSorted = isSorted(arr);
        
        // Print the final result based on the boolean value.
        if(isSorted){
            System.out.println("The array is sorted.");
        } else{
            System.out.println("The array is not sorted.");
        }
    }

    /**
     * Checks if an array is sorted in ascending order.
     * @param arr The array to check.
     * @return True if sorted, false otherwise.
     */
    public static boolean isSorted(int[] arr){
        int i = 0;
        // Loop up to the second-to-last element to avoid an error.
        while(i < arr.length - 1){
            // If any element is greater than its next neighbor, it's not sorted.
            if (arr[i] > arr[i+1]){
                return false; // Immediately exit and return false.
            }
            i++;
        }
        
        // If the loop completes without finding any issues, the array is sorted.
        return true;
    }
}
