package Arrays;

import Basic.AO;

//maximum sum of sub array
// time complexity = O(N)
public class Kadanes_algo {
    public static void main(String[] args) {
        int[] arr = AO.ins();
        System.out.println("Max sum of sub array is :"+kadane(arr));
    }
    static int kadane(int[] arr){
        if(arr.length==0) return 0;
        int curSum = 0;
        int maxSum = 0;
        int negative = Integer.MIN_VALUE;
        for (int i:arr) {
            curSum+=i;
            if(curSum>maxSum){
                maxSum = curSum;
            }
            // check cumSum is not negative if it is then make it zero.
            if(curSum<0) {
                curSum = 0;
            }
            if(negative<i){
                negative = i;
            }
        }
        return maxSum==0?negative:maxSum;
    }
}
