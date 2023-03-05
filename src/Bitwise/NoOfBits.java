package Bitwise;
//time complexity is logn
public class NoOfBits {
    public static void main(String[] args) {
        int num = 1234;
        int base = 2;
        int ans = (int)(Math.log(num)/Math.log(base) + 1);
        System.out.println(ans);
    }
}
