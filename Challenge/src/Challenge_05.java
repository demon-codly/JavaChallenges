//5.Create a program to input name of the person and respond with "Welcome NAME to KG Coding"

import java.util.Scanner;

public class Challenge_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, Enter your name: ");
        String name = input.next();
        System.out.printf("%s, Welcome to KG Coding", name);
    }
}
