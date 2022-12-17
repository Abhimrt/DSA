package Arrays;

import Basic.AO;

public class Stocks {
    public static void main(String[] args) {
        int arr[] = AO.ins();
        System.out.println("Profit = "+Prof(arr));
        System.out.println("Maximum Profit = "+maxProf(arr));
    }
    static int Prof(int arr[]){
        int minDate = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i : arr) {
            minDate = Math.min(minDate,i);
            maxProfit = Math.max(maxProfit,(i-minDate));
        }
        return maxProfit;
    }

    static int maxProf(int[] arr){
        int profit = 0;
        for (int i = 0 ;i<arr.length-1;i++){
            profit+=Integer.max(0,arr[i+1]-arr[i]);
        }
        return profit;
    }


}
