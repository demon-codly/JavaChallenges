//45. Create a program to reverse an array.

import java.util.Random;
import java.util.Arrays;
public class Challenge_45 {
    public static void main(String[] args){
        Random random = new Random();

        int[] arr = new int[10];
        System.out.println("The original array list is, ");
        int i = 0;
        int bound  = 100;
        while(i < arr.length){
            arr[i] = random.nextInt(bound);
            System.out.print(arr[i]+" ");
            i++;
        }
        System.out.println();

        //reverse
        int[] newArr = new int[10];
        i = arr.length-1;
        int k = 0;
        while(i >= 0){
            newArr[k] = arr[i];
            i--;
            k++;

        }

        System.out.print("the new reversed array is " + Arrays.toString(newArr));
    }
}
