//9. Create a program to calculate product of two floating points numbers.

import java.util.Scanner;

public class Challenge_09 {
    public static void main(String[] args) {
        System.out.println("Product of Two Floating Point");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter floating point number 1: ");
        float num1 = input.nextFloat();
        System.out.print("Enter floating point number 2: ");
        float num2 = input.nextFloat();

        //product
        float product = num1 * num2;

        //print
        System.out.printf("The product of two floating point number is, %f", product);
    }
}
