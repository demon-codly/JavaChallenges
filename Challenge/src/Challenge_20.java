//20.Create a program that categorize a person into different age groups
//Child -> below 13
//Adult -> below 50
//Teen -> below 20
//Senior-> above 60

import java.util.Scanner;

public class Challenge_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Categorizing a person into Different age group");

        //input
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        //logic
        if (age < 13) {
            System.out.println("You are a Child");
        } else if (age <20) {
            System.out.println("You are a Teen");
        } else if (age < 50) {
            System.out.println("You are a Adult");
        } else if (age > 60) {
            System.out.println("You are a Senior");
        }
    }
}
