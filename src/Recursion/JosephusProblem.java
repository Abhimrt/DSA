package Recursion;
// in this problem there were n numbers of people from which 1st kill the third one and then give gun to the next one and the procedure repeat
//by this algo we found the last person left
public class JosephusProblem {
    public static void main(String[] args) {
        System.out.println(jos(5,3));
    }
    static int jos(int n,int k){
        return n==1?0:(jos(n-1,k)+k)%n;
    }
}
