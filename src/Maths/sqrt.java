package Maths;

public class sqrt {
    public static void main(String[] args) {
        System.out.printf("%.2f",sqrt(40,2));
    }
    static double sqrt(int val,int pre){
        if(val<2) return (double) val;
        double ans = 1;
        int right = val;
        int left = 1;

        while(left<=right){
            int mid = left + (right-left)/2;
            if(mid*mid == val){
                return  mid;
            }else if(mid*mid>val){
                right= mid-1;
            }else{
                left = mid+1;
            }
        }
        ans = right;
        double inc = 0.1;
        for (int i = 0; i < pre; i++) {
            while(ans*ans<=val){
                ans +=inc;
            }
            ans -=inc;
            inc /=10;
        }
        return ans;
    }
}
