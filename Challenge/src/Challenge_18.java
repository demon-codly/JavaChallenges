//18. Create a program that determines if a given year is a leap year
// (considering conditions like divisible by 4 but not 100, unless also divisible by 400).

import java.sql.SQLOutput;
import java.util.Scanner;

public class Challenge_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Determining the leap year or not");

        //input
        System.out.print("Enter the Year: ");
        int year = input.nextInt();

        //logic
        if ((year % 4 == 0 && year % 100 == 0) || year % 400 != 0){
            System.out.println("The given year is a Leap Year");
        } else {
            System.out.println("The given year is not a Leap Year");
        }
    }
}
