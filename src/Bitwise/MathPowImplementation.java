package Bitwise;

public class MathPowImplementation {
    public static void main(String[] args) {
        int base = 3;
        int pow = 5;
        int ans = 1;
        while(pow!=0){
            if((pow&1) == 1){
                ans *=base;
            }
            base *=base;
            pow >>=1;
        }
        System.out.println(ans);
    }
}
