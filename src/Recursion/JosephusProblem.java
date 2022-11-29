package Recursion;

public class JosephusProblem {
    public static void main(String[] args) {
        System.out.println(jos(5,3));
    }
    static int jos(int n,int k){
        return n==1?0:(jos(n-1,k)+k)%n;
    }
}
