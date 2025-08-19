//15.Create a program that determines if a number is positive, negative, or zero.

import java.util.Scanner;

public class Challenge_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Determining the Number is +, - or 0");

        //input
        System.out.print("Enter the Number: ");
        int num = input.nextInt();

        //logic
        if (num > 0) {
            System.out.println("The number is positive");
        } else if (num < 0 ) {
            System.out.println("The number is Negative");
        } else {
            System.out.println("the number is zero");
        }

    }
}
