package Backtraking;

import java.util.Arrays;

public class Maze {

//    int this problem we have to go from top left corner to bottom right corner
//    we can go in every direction like up, down, left, right
//    we have to return the possible ways in which we can go from one point to another

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        boolean[][] travel = new boolean[n][m];
        System.out.println(noOfWays(n-1,m-1,travel));
        System.out.println();
        System.out.println("The Representation of the paths");
        pathRepresentation(0,0,travel,new int[n][m],"",1);
    }

    public static int noOfWays(int n,int m,boolean[][] travel){

//        return 0 when it goes out of the boundary or if I previously traversed this node
        if(n<0 || m<0 || n== travel.length || m == travel[0].length || travel[n][m]) return 0;

//        return 1 if it goes to the top left portion
        if(n==0 & m==0) return 1;

//        make current node visited
        travel[n][m] = true;

        // up
        int ans = noOfWays(n+1,m,travel);

        // right
        ans += noOfWays(n,m+1,travel);

        // down
        ans += noOfWays(n-1,m,travel);

        // left
        ans += noOfWays(n,m-1,travel);

//        before we pop this from rec stack we have to make current node as not visisted
        travel[n][m] = false;

        return ans;
    }

    public static void pathRepresentation(int n,int m,boolean[][] travel,int path[][],String dir, int steps){
        //        return 0 when it goes out of the boundary or if I previously traversed this node
        if(n<0 || m<0 || n== travel.length || m == travel[0].length || travel[n][m]) return;

//        return 1 if it goes to the top left portion
        path[n][m] = steps;
        if(n== travel.length-1 & m== travel[0].length-1){
            for(int[] i:path){
                System.out.println(Arrays.toString(i));
            }
            System.out.println(dir);
            System.out.println();
            path[n][m] = 0;
            return;
        }

//        make current node visited
        travel[n][m] = true;

        // down
        pathRepresentation(n+1,m,travel,path,dir+"D",steps+1);

        // right
        pathRepresentation(n,m+1,travel,path,dir+"R",steps+1);

        // up
        pathRepresentation(n-1,m,travel,path,dir+"U",steps+1);

        // left
        pathRepresentation(n,m-1,travel,path,dir+"L",steps+1);

//        before we pop this from rec stack we have to make current node as not visisted
        travel[n][m] = false;
        path[n][m] = 0;
    }

}
