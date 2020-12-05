package test.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class IOUtilsOnArrays {
    static public int[] getUnsortedInput() {
        System.out.println("How many numbers ");
        Scanner sc =  new Scanner(System.in);
        int number = sc.nextInt();
        if (number<0) return null;
        int[] array  =  new int[number];
        int init = 0;
        while(init < number) {
            array[init] = sc.nextInt();
            init++;
        }
        return array;
    }
   static public void showArrays(int ... array) {
        Arrays.stream(array).forEach(value -> System.out.print(value));
       System.out.println();
    }
}
