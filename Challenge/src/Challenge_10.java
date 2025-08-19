import java.util.Scanner;

//10.Create a program to calculate Perimeter of a rectangle. Perimeter of rectangle ABCD = A+B+C+D
public class Challenge_10 {
    public static void main(String[] args) {
        System.out.println("Perimeter of a Rectangle");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of side 1 of the rectangle: ");
        int num1 = input.nextInt();
        System.out.print("Enter the number of side 2 of the rectangle: ");
        int num2 = input.nextInt();
        System.out.print("Enter the number of side 3 of the rectangle: ");
        int num3 = input.nextInt();
        System.out.print("Enter the number of side 4 of the rectangle: ");
        int num4 = input.nextInt();

        //Perimeter of Rectangle
        int perimeterLelfHandSide = num1 * num2 * num3 * num4;
        int perimeterRightHandSide = num1 + num2 + num3 + num4;
        //int perimeter = (perimeterLelfHandSide == perimeterRightHandSide);

        //print
        System.out.printf("The perimeter of an Rectangle is, %d", perimeterRightHandSide);
    }
}
