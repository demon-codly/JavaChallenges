//17. Create a program that determines the greatest of the three numbers.

import java.util.Scanner;

public class Challenge_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Determining the Number is odd or even");

        //input
        System.out.print("Enter the Number 1: ");
        int num1 = input.nextInt();

        System.out.print("Enter the Number 2: ");
        int num2 = input.nextInt();

        System.out.print("Enter the Number 3: ");
        int num3 = input.nextInt();

        //logic
        if (num1 > (num2 & num3)){
            System.out.println("The first number is greater among all 3 number");
        } else if (num2 > num3) {
            System.out.println("The second number is greater among all 3 number");
        } else {
            System.out.println("The third number is greater among all 3 number");
        }
    }
}
