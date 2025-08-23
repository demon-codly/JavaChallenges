//48. Create a program to search an element in a 2-D array.

import java.util.Random;
import java.util.Scanner;

public class Challenge_48 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Random random = new Random();

        int[][] arr = new int[5][5];

        int i = 0;
        int bound = 100;
        while(i < arr.length){
            int j = 0;
            while(j < arr[i].length){
                arr[i][j] = random.nextInt(bound);
                System.out.print(arr[i][j] + "\t");
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.print("Enter the number you want to search: ");
        int num = input.nextInt();

        Boolean isFound = isFound(arr, num); 
        if(isFound){
            System.out.println("The Number is Found");
        } else {
            System.out.println("The Number is not Found");

        }
    }

    public static boolean isFound(int[][] arr, int num){
        boolean found = false;
        int i = 0;
        while(i < arr.length && !found){
            int j = 0;
            while(j < arr[i].length && !found){
                if(arr[i][j] == num){
                    found = true;
                }
                j++;
            }
            i++;
        }
        return found;
    }
}
