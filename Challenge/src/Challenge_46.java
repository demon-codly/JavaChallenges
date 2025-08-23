import java.util.Arrays;

public class Challenge_46 {

    public static void main(String[] args) {
        // Define an array to test.
        int[] arr = {10, 20, 30, 20, 10}; // Example of a palindrome
        // int[] arr = {10, 20, 10, 10, 20, 30}; // Original non-palindrome example

        // Check if the array is a palindrome by calling the helper method.
        boolean isPalindrome = isPalindrome(arr);

        // Print the result to the console.
        if (isPalindrome) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }
    }

    /**
     * Checks if an integer array is a palindrome by reversing it and comparing
     * the reversed version to the original.
     *
     * @param arr The integer array to check.
     * @return true if the array is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(int[] arr) {
        // Create a new array to store the reversed version.
        int[] reversedArray = new int[arr.length];

        // Initialize index pointers for the loop.
        int k = 0; // Index for the new array (starts from the beginning).
        int i = arr.length - 1; // Index for the original array (starts from the end).

        // Loop backwards through the original array to create a reversed copy.
        while (i >= 0) {
            reversedArray[k] = arr[i]; // Copy the element.
            k++; // Move to the next position in the new array.
            i--; // Move to the previous position in the original array.
        }

        // Compare the original array with its reversed version.
        // Arrays.equals() returns true if they are identical.
        return Arrays.equals(reversedArray, arr);
    }
}
