//19.Create a program that calculates grades based on marks
//A -> above 90%
//C -> above 60%
//F -> below 30%
//B -> above 75%
//D -> above 30%

import java.sql.SQLOutput;
import java.util.Scanner;

public class Challenge_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Grades calculation based on Marks");

        //input
        System.out.print("Enter the student mark: ");
        int marks = input.nextInt();

        //logic
        if (marks > 90){
            System.out.println("The grade obtained by the student is \"A\"");
        } else if (marks > 75) {
            System.out.println("The grade obtained by the student is \"B\"");
        } else if (marks > 60) {
            System.out.println("The grade obtained by the student is \"C\"");
        } else if (marks > 30) {
            System.out.println("The grade obtained by the student is \"D\"");
        } else if (marks < 30) {
            System.out.println("The grade obtained by the student is \"F\"");
        }
    }
}
