//30.Write a function that calculates the factorial of a given number.

import java.util.Scanner;

public class Challenge_30 {
    public static void main(String[] args) {
        factorial();
    }

    public static void factorial() {
        Scanner input = new Scanner(System.in);
        System.out.println("Factorial of a Given Number.....");
        System.out.print("Enter the Factorial Number: ");
        int a = input.nextInt();
        int i = 1;
        long result=1;

        while (a >= i) {
            result *= i;
            i++;
        }

        System.out.println("The Factorial of Given Number is " + result);
    }
}
