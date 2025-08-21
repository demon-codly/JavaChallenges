//42. Create a program to find the maximum and minimum element in an array.

import java.util.Random;
public class Challenge_42 {
    public static void main(String[] args){
        Random random = new Random();

        System.out.print("The element in the array list: ");
        int[] arr = new int[15];

        int bound = 100;
        int i = 0;
        while (i < arr.length){
            arr[i] = random.nextInt(bound);
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();

        //maximum
        i = 1;
        int max = arr[0];
        while (i < arr.length){
            if (max < arr[i]){
                max = arr[i];
                //System.out.println(max);
            }
            i++;
        }

        //minimum
        i = 1;
        int min = arr[0];
        while (i < arr.length){
            if (min > arr[i]){
                min = arr[i];
                //System.out.println(min);
            }
            i++;
        }

        System.out.printf("The maximum number is %d\n", max);
        System.out.printf("The minimum number is %d", min);
    }
}
