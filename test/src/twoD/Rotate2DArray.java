package twoD;

import java.util.Arrays;

public class Rotate2DArray {
    public static void main(String[] args) {
        rotateAntiClock( new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        rotateClock( new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }

    public static void rotateAntiClock(int[][] arr)
    {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n ; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        reverseRow(arr,n);
        showResult(arr);
    }
    public static void rotateClock(int[][] arr)
    {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n ; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        reverseCol(arr,n);
        showResult(arr);
    }
    public static void reverseRow(int[][] arr, int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0, k = n-1; j < k; j++,k--) {
               int temp  = arr[i][j];
                arr[i][j] = arr[i][k];
                arr[i][k] = temp;
            }
        }
    }
    public static void reverseCol(int[][] arr, int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0, k = n-1; j < k; j++,k--) {
                int temp  = arr[j][i];
                arr[j][i] = arr[k][i];
                arr[k][i] = temp;
            }
        }
    }

    public static void showResult(int[][] arr){
        Arrays.stream(arr).forEach(row -> {
            Arrays.stream(row).forEach(System.out::print);
                    System.out.println();
        }
        );
    }

}
