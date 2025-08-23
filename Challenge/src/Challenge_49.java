import java.util.Random;
import java.util.Arrays;

public class Challenge_49 {
    public static void main(String[] args){
        // Create a Random object to generate random numbers.
        Random random = new Random();

        // -- 2D Array Creation and Population --
        // Declare and initialize a 3x3 2D integer array.
        int[][] arr = new int[3][3];
        int i = 0;
        int bound = 100; // Set the upper bound for random numbers (exclusive).

        // Use nested while loops to populate the array.
        while(i < arr.length){ // Iterate through each row.
            int j = 0;
            while(j < arr[i].length){ // Iterate through each column in the current row.
                // Assign a random integer (0-99) to the current element.
                arr[i][j] = random.nextInt(bound);
                j++;
            }
            i++;
        }

        // -- Sorting each row of the array --
        int k = 0;
        while(k < arr.length){
            // Sort the elements of each individual row.
            Arrays.sort(arr[k]);
            k++;
        }

        // -- Printing the 2D Array --
        System.out.println("Generated and Sorted 2D Array:");
        i = 0;
        while(i < arr.length){ // Iterate through rows.
            int j = 0;
            while(j < arr[i].length){ // Iterate through columns.
                // Print the element followed by a tab for formatting.
                System.out.print(arr[i][j]+"\t");
                j++;
            }
            // Move to the next line after printing all columns in a row.
            System.out.println();
            i++;
        }
        System.out.println(); // Add a blank line for better readability.

        // -- Sum and Average Calculation --
        int sum = 0;
        double average = 0;
        int count = 0; // To count the total number of elements.
        i = 0;

        // Iterate through the array to find the sum of all elements.
        while(i < arr.length){
            int j = 0;
            while(j < arr[i].length){
                // Add the current element's value to the sum.
                sum += arr[i][j];
                // Increment the element counter.
                count++;
                j++;
            }
            i++;
        }

        // -- Calculate the average --
        // Cast the sum to a double to ensure floating-point division.
        average = (double) sum / count;

        // -- Print the final results --
        // Print the calculated sum using formatted output.
        System.out.printf("The sum of all elements in the Array is: %d\n", sum);
        // Print the calculated average using formatted output.
        System.out.printf("The average of all elements in the Array is: %f", average);
    }
}
