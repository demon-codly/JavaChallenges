//6.Create a program to add two numbers.

import java.util.Scanner;

public class Challenge_06 {
    public static void main(String[] args) {
        System.out.println("Adding two Numbers");
        Scanner input = new Scanner(System.in);
        System.out.print("Please, Enter Number 1: ");
        int num1 = input.nextInt();
        System.out.print("Please, Enter Number 2: ");
        int num2 = input.nextInt();

        int add = num1 + num2;
        System.out.printf("The result of Adding both given Numbers is %d", add);
    }
}
