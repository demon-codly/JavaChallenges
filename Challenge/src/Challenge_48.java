//48. Create a program to search an element in a 2-D array.

import java.util.Random;

public class Challenge_48 {
    public static void main(String[] args){

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
    }
}
