//24. Create a program that shows bitwise compliment of a number.

import java.util.Scanner;

class Challenge_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitwise Not Operator\n");

        //input
        System.out.print("Enter 1st Number: ");
        int a = input.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = input.nextInt();

        //logic
        int result = ~a;

        //print statement
        System.out.println("The Result is: " + result);
    }
}
