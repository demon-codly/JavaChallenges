//11.Create a program to calculate the Area of a Triangle. Area of triangle = 2*B*H

import java.util.Scanner;

public class Challenge_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Area of Triangle..");
        System.out.print("Enter the breadth of Triangle: ");
        int width = input.nextInt();
        System.out.print("Enter the Height of Triangle: ");
        int height = input.nextInt();

        //formula
        int area = 2 * width * height;

        //final print statement
        System.out.printf("The area of Triangle for given breadth and height is %d", area);
    }
}
