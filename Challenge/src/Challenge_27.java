//27. Write a program to check if a given number is even or odd using bitwise operators.

import java.util.Scanner;

public class Challenge_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number is even or odd using bitwise operator\n");

        //input
        System.out.print("Enter 1st Number: ");
        int num = input.nextInt();


        if ((num&1)==1){
            System.out.println("The given Number is Odd");
        } else if ((num&1)==0) {
            System.out.println("The given number is Even");
        }
    }
}
