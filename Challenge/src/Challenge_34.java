//34.Create a program to check whether a given number is prime.

import java.util.Scanner;

public class Challenge_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Check Whether a given number is prime.....");
        System.out.print("Enter the Number: ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        if (isPrime){
            System.out.println("the given number is Prime");
        }
        else {
            System.out.println("the given number is not prime");
        }
    }
    public static boolean isPrime(int num) {
        int i = 2;

        while (i < num){
            if (num%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
