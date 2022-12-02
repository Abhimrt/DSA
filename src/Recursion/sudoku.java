package Recursion;

import java.util.Arrays;

public class sudoku {
    public static void main(String[] args) {
        int[][] grid = new int[][] {
                {7, 0, 0, 0, 0, 0, 2, 0, 0},
                {4, 0, 2, 0, 0, 0, 0, 0, 3},
                {0, 0, 0, 2, 0, 1, 0, 0, 0},
                {3, 0, 0, 1, 8, 0, 0, 9, 7},
                {0, 0, 9, 0, 7, 0, 6, 0, 0},
                {6, 5, 0, 0, 3, 2, 0, 0, 1},
                {0, 0, 0, 4, 0, 9, 0, 0, 0},
                {5, 0, 0, 0, 0, 0, 1, 0, 6},
                {0, 0, 6, 0, 0, 0, 0, 0, 8}
        };
        boolean output = sud(grid,0,0);
        System.out.println(output);
        for(int i[]:grid){
            System.out.println(Arrays.toString(i));
        }
    }
    static boolean sud(int[][] grid,int row,int col){
//        stop conditions
        if(row==grid.length){
            return true;
        }

//        conditions for the next cell
        int nrow,ncol;
        if(col==grid.length-1){
            nrow = row+1;
            ncol = 0;
        }else{
            nrow = row;
            ncol = col+1;
        }

//        basic logic
        if(grid[row][col]!=0){
            if (sud(grid,nrow,ncol)){
                return true;
            }
        }else{
            for (int i = 1 ;i <=9; i++) {
                if(safe(grid,row,col,i)){
                    grid[row][col]=i;
                    if(sud(grid,nrow,ncol)){
                        return true;
                    }
                    grid[row][col]=0;
                }
            }
        }
        return false;
    }

    static boolean safe(int[][] grid,int row,int col,int num){
//        chk horizontal and vertical
        for(int i=0;i< grid.length;i++){
            if(grid[row][i]==num || grid[i][col]==num){
                return false;
            }
        }
//        chk in the inner box
        for(int i=(row-row%3);i<(row-row%3)+3;i++){
            for(int j= (col-col%3);j<(col-col%3)+3;j++){
                if(grid[i][j]==num){
                    return false;
                }
            }
        }

        return true;

    }
}
