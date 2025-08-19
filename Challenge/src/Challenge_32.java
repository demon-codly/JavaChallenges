//32.Create a program to find the Least Common Multiple (LCM) of two numbers.

import java.util.Scanner;

public class Challenge_32 {
    public static void main(String[] args) {
        lCM();
    }

    public static void lCM() {
        Scanner input = new Scanner(System.in);
        System.out.println("Least Common Multiple of two Number.....");
        System.out.print("Enter the First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the Second Number: ");
        int num2 = input.nextInt();

        int a = num1;
        int b = num2;
        while(num2 != 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        int gcd = num1;

        int lcm = (a * b)/gcd;

        System.out.println("the Least Common Multiple (LCM) of two given number is " + lcm);
    }
}
//int a = 48;
//int b = 18;
//int temp = b;   // temp = 18
//b = a % b;      // b = 48 % 18 = 12
//a = temp;       // a = 18
//a = 18
//b = 12
//GCD(48, 18) → GCD(18, 12)
//Iteration 2:
//temp = b;       // temp = 12
//b = a % b;      // b = 18 % 12 = 6
//a = temp;       // a = 12
//a = 12
//b = 6
//GCD(18, 12) → GCD(12, 6)
//Iteration 3:
//temp = b;       // temp = 6
//b = a % b;      // b = 12 % 6 = 0
//a = temp;       // a = 6
//a = 6
//b = 0
//GCD(12, 6) → GCD(6, 0)