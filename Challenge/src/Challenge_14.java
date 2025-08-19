//14.Create a program to convert Fahrenheit to Celsius
//°C = (°F-32) x 5/9

import java.util.Scanner;

public class Challenge_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Converting Fahrenheit to celsius");

        System.out.print("Enter the Temperature in Fahrenheit: ");
        double fahren = input.nextDouble();

        //formula
        double celsius = (fahren - 32) * 5/9;

        //final print statement
        System.out.printf("The temperature after converting from Fahrenheit into celsius is %.2f%n", celsius);
    }
}
