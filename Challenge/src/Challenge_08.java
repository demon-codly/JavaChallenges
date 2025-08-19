//8. Create a program that takes two numbers and shows result
// of all arithmetic operators (+,-,*,/,%).

import java.sql.SQLOutput;
import java.util.Scanner;

public class Challenge_08 {
    public static void main(String[] args) {
        System.out.println("All Arithmetic Operators");
        Scanner input = new Scanner(System.in);
        System.out.print("Please, Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Please, Enter number 2: ");
        int num2 = input.nextInt();

        //Addition
        int add = num1 + num1;

        //Subtraction
        int sub = num1 - num2;

        //Multiplication
        int muliply = num1 * num2;

        //Division
        int div = num1 / num2;

        //modulus
        int reminder = num1 % num2;

        System.out.printf("The All Arithmetic Operators on both the given numbers are, \n" +
                "1. Addition of two given number: %d\n" +
                "2. Subtraction of two given number: %d\n" +
                "3. Multiplication of two given number: %d\n" +
                "4. Division of two given number: %d\n" +
                "5. Modulus of two given number: %d\n", add, sub, muliply, div, reminder);
    }
}
