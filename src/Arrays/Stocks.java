package Arrays;

import Basic.AO;

public class Stocks {
    public static void main(String[] args) {
        int arr[] = AO.ins();
        System.out.println("Maximum profit = "+maxProf(arr));
    }
    static int maxProf(int arr[]){
        int minDate = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i : arr) {
            minDate = Math.min(minDate,i);
            maxProfit = Math.max(maxProfit,(i-minDate);
        }
        return maxProfit;
    }
}
