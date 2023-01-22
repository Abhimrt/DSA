package DynamicProgramming;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 900;
        System.out.println(fibDP(n,new long[n+1]));
        System.out.println(fib(n));
    }
    //here we use the normal recursion method which takes more time to run a problem
    // time complexity = O(2^n)
    static long fib(int n){
        if(n==0||n==1) return n;
        return fib(n-1)+fib(n-2);
    }
    //here we use the DP recursion method which takes less time to run a problem
    // time complexity = O(n)
    static long fibDP(int n, long[] memo ){
        if(memo[n] !=0) return memo[n];
        if(n==0||n==1) return n;
        memo[n] = fibDP(n-1,memo)+fibDP(n-2,memo);
        return memo[n];
    }
}
