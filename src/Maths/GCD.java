package Maths;

public class GCD {
    public static void main(String[] args) {
        int a = 15;
        int b=30;
        System.out.println(gcd(a,b));
    }
    static int gcd(int a,int b){
        return a%b==0?b:gcd(b,a%b);
    }
}
