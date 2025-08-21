import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Challenge_44 {
    public static void main(String[] args){
        // Initialize tools for user input and random number generation.
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        // Initialize an integer array of size 10.
        int[] arr = new int[10];

        // --- Fill the array with random numbers ---
        int i = 0;
        int bound = 100; // Numbers will be from 0 to 99.
        while(i < arr.length){
            arr[i] = random.nextInt(bound); // Assign a random number.
            System.out.print(arr[i]+" "); // Print the number.
            i++;
        }
        System.out.println(); // Move to the next line for clean output.

        // Get the number to delete from the user.
        System.out.print("Enter the number you want to delete from the above array list: ");
        int num = input.nextInt();
        
        // Create a new array with a fixed size of 9.
        int[] sampleArray = new int[9];
        
        // Reset counters for the copy loop.
        i = 0; // Index for original array.
        int k = 0; // Index for new array.
        
        // Loop through the original array.
        while(i < arr.length){
            // If the element matches the number to delete, skip it.
            if (arr[i] == num){
                i++;
                continue;
            }

            // Copy the element to the new array.
            sampleArray[k] = arr[i];
            i++;
            k++;
        }

        // Print the final array.
        System.out.println("The update Array element is" + Arrays.toString(sampleArray));
    }
}
