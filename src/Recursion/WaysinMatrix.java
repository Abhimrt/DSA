package Recursion;
//in this algo we found the no of ways to go to the bottom right corner of the matrix
public class WaysinMatrix {
    public static void main(String[] args) {
        System.out.println(ways(3,3));
    }
    static int ways(int n,int m){
        if(n==1 || m==1){
            return 1;
        }
        return ways(n-1,m)+ways(n,m-1);
    }
}
