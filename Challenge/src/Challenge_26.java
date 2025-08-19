//26. Create a program that shows use of right shift operator.
import java.util.Scanner;

public class Challenge_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitwise Right Shift Operator\n");

        //input
        System.out.print("Enter 1st Number: ");
        int a = input.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = input.nextInt();

        //logic
        int result = a >> b;

        //print statement
        System.out.println("The Result is: " + result);
    }
}
