package Bitwise;

public class SetBits {
    public static void main(String[] args) {
         int n = 10;
        System.out.println(second(n));
    }
    static int first(int n){
        int count =0;
        while(n>0) {
            count++;
            n -= (n & -n);
//            System.out.println("Binary of " + n + " -> " + Integer.toBinaryString(n));
        }
        return count;
    }
    static int second(int n){
        int count =0;
        while(n>0) {
            count++;
            n = (n & (n-1));
//            System.out.println("Binary of " + n + " -> " + Integer.toBinaryString(n));
        }
        return count;
    }
}
