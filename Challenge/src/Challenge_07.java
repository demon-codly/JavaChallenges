//7. Create a program to swap two numbers.

import java.util.Scanner;

public class Challenge_07 {
    public static void main(String[] args) {
        System.out.println("Swappig the two Numbers");
        Scanner input = new Scanner(System.in);
        System.out.print("Please, Enter the Number 1: ");
        int num1 = input.nextInt();
        System.out.print("PLease, Enter the number 2: ");
        int num2 = input.nextInt();

        //swap
        int swap = num1;
        num1 = num2;
        num2 = swap;

        System.out.printf("Your both swapped numbers are, \n" +
                "Number 1: %d\n" +
                "Number 2: %d", num1, num2);
    }
}
