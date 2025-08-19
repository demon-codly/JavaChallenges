//16.Create a program that determines if a number is odd or even.

import java.util.Scanner;

public class Challenge_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Determining the Number is odd or even");

        //input
        System.out.print("Enter the Number: ");
        int num = input.nextInt();

        //logic
        if (num % 2 == 0) {
            System.out.println("The given number is Even");
        } else {
            System.out.println("The given number is Odd");
        }
    }
}
