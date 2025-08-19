//38. Create a program to verify if a number is a palindrome

import java.util.Scanner;

public class Challenge_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Input
        System.out.println("Check if a number is a palindrome...");
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        //Check Palindrome
        if (isPalindrome(num)){
            System.out.println(num + " is a Palindrome Number.");
        } else {
            System.out.println(num + " is not a Palindrome Number.");
        }
    }

    public static boolean isPalindrome(int num) {
        if (num < 0) return false;

        int temp = num;
        int sum = 0;
        int reversed = 0;
        while (temp > 0) {
            sum = temp % 10;
            reversed = reversed * 10 + sum;
            temp /= 10;
        }
        return reversed == num;
    }
    
}
