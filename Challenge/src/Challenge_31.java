//31.Create a program that computes the sum of the digits of an integer.
import java.util.Scanner;

public class Challenge_31 {
    public static void main(String[] args) {
        sumOfDigit();
    }
    public static void sumOfDigit(){
        Scanner input = new Scanner(System.in);
        System.out.println("The Sum of the Digit of an Integer");
        System.out.print("Enter the Number: ");
        int num = input.nextInt();
        int sum = 0;
        int digit = 0;

        while (num > 0) {
            digit = num % 10;
            num = num / 10;
            sum += digit;
        }
        System.out.println("The sum of the Digit of given Integers is " + sum);
    }
}