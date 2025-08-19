//33.Create a program to find the Greatest Common Divisor (GCD) of two integers.
import java.util.Scanner;

public class Challenge_33 {
    public static void main(String[] args) {
        gCD();
    }

    public static void gCD() {
        Scanner input = new Scanner(System.in);
        System.out.println("the Greatest Common Divisor (GCD) of two integers.....\n");
        System.out.print("Enter the 1st Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the 2nd Number: ");
        int num2 = input.nextInt();

        while (num2!=0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        System.out.println("the Greatest Common Divisor (GCD) of two integers is " + num1);
    }
}
