package Bitwise;
/*
    let find for 8 in bits
    8 -> 1000
    if we do & of 8 with 7 (8-1) then it gives zero
    8 -> 1000
    7 -> 0111
   ans-> 0000
 */
public class PowerOfTwo {
    public static void main(String[] args) {
        int a = 31;
        boolean ans = ((a & (a-1)) == 0) & a!=0;
        System.out.println(ans);
    }
}
