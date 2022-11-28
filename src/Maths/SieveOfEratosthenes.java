package Maths;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n =20;
        boolean arr[] = sieve(n);
        for (int i = 0; i <n+1; i++) {
            if(arr[i]){
                System.out.print(i+" ");
            }
        }
    }
    static boolean[] sieve(int n){
        boolean arr[] = new boolean[n+1];
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1] = false;
        for(int i = 2;i*i<n+1;i++){
            for(int j = 2*i;j<n+1;j+=i){
                arr[j]=false;
            }
        }
        return arr;
    }
}
