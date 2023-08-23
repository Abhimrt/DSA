package Backtraking;

import java.util.Arrays;

public class NQueen {
    public static void main(String[] args) {
        int n = 4;
        int[][] arr = new int[n][n];
        nQueen(arr,0);
        for(int[] i:arr){
            System.out.println(Arrays.toString(i));
        }
    }

    public static boolean nQueen(int[][] arr, int row){
        if(row == arr.length) return true;

        for (int i = 0; i < arr[0].length; i++) {
            if(safe(arr,row,i)){
                arr[row][i] = 1;
                if(nQueen(arr,row+1)){
                    return true;
                }
                arr[row][i] = 0;
            }
        }

        return false;
    }

//    this function will check if the queen is safe or not to put here by checking the previous row queens position
    public static boolean safe(int[][] arr, int n,int m){
        if(n==0) return true;

        int j = 1;
        for(int i= n-1;i>=0;i--){
            // upward
            if(arr[i][m] ==1){
                return false;
            }


            // left diagonal
            if(m-j>-1 && arr[i][m-j] == 1){
                return false;
            }

            // right diagonal
            if(j+m<arr.length && arr[i][j+m] == 1){
                return false;
            }

            j++;
        }
        return true;
    }
}
