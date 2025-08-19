//Create a program that shows bitwise AND of two numbers.

import java.util.Scanner;

public class Challenge_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitwise And Operator\n");

        //input
        System.out.print("Enter 1st Number: ");
        int a = input.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = input.nextInt();

        //logic
        int result = a & b;

        //final print statement
        System.out.println("The Result is: " + result);
    }
}
