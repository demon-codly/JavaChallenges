//37.Create a program to check if a number is an Armstrong number
import java.util.Scanner;

public class Challenge_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.println("Check if a number is an Armstrong number...");
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Check Armstrong
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

        input.close();
    }

    // Function to check Armstrong number
    public static boolean isArmstrong(int num) {
        if (num < 0) return false; // Armstrong numbers are non-negative

        int temp = num;
        int digits = countDigits(num);
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == num;
    }

    // Function to count digits
    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
