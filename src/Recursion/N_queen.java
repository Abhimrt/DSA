package Recursion;

import java.util.Arrays;

public class N_queen {
    public static void main(String[] args) {
        int n = 10;
        int[][] board = new int[n][n];
        System.out.println(nQueen(board,0));
        for (int i[]:board) {
            System.out.println(Arrays.toString((i)));
        }
    }
    static boolean nQueen(int b[][],int row){
        if(row==b.length){
            return true;
        }
        for(int col=0;col<b.length;col++){
            if(safe(b,row,col)){
                b[row][col]=1;
                if(nQueen(b,row+1)){
                    return true;
                }
                b[row][col]=0;
            }
        }
        return false;
    }

    static boolean safe(int board[][], int row, int col)
    {
        int i, j;
        /* Check this upside */
        for (i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }
        /* Check upper diagonal on left side */
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        /* Check upper diagonal on right side */
        for (i = row, j = col; j < board.length && i >= 0; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }
}
