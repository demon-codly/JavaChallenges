//47. Create a program to merge two sorted arrays.

import java.util.Random;
import java.util.Arrays;

public class Challenge_47 {
    public static void main(String[] args){
        // Setup random number generator and arrays
        Random random = new Random();
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        int bound = 100;

        // Fill the first array with random numbers
        System.out.println("Array 1:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(bound);
        }
        System.out.println(Arrays.toString(arr1)); // Print the array

        // Fill the second array with random numbers
        System.out.println("\nArray 2:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(bound);
        }
        System.out.println(Arrays.toString(arr2)); // Print the array

        // Create a new array to hold the merged result
        int[] merge = new int[arr1.length + arr2.length];
        
        // Copy all elements from arr1 into the start of merge
        System.arraycopy(arr1, 0, merge, 0, arr1.length);
        
        // Copy all elements from arr2 into the end of merge
        System.arraycopy(arr2, 0, merge, arr1.length, arr2.length);

        // Show the combined array before it's sorted
        System.out.println("\nMerged array (before sorting):");
        System.out.println(Arrays.toString(merge));

        // Sort the entire merged array
        Arrays.sort(merge);

        // Print the final sorted result
        System.out.println("\nFinal sorted array:");
        System.out.println(Arrays.toString(merge));
    }
}
