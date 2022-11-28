package Maths;

public class ModuloArthmetic {
    public static void main(String[] args) {
        System.out.println(fastpow(35342523,5,1000000007));
    }
    static long fastpow(int a,int b,int n){
        long res = 1;
        while(b!=0){
            if((b&1)==1){
                res=((res%n)*(a%n))%n;
            }
            a=((a%n)*(a%n))%n;
            b = b>>1;
        }
        return res;
    }
}
