//29.Create a program to sum all odd numbers from 1 to a specified number N.

import java.util.Scanner;

public class Challenge_29 {
    public static void main(String[] args) {
        sumOdd();
    }


    public static void sumOdd() {
        Scanner input = new Scanner(System.in);
        System.out.println("Sum of all odd numbers.......\n");
        System.out.print("Enter the odd number: ");
        int a = input.nextInt();
        int i = 0;
        int store = 0;

        while (a > i) {
            if (i % 2 != 0) {
                store += i;
            }
            i++;
        }
        System.out.println("Sum of Odd Numbers " + store);
    }

}