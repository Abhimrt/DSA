package SubArray;

/*
    This is based on hashing In this program we find the subarray with the given sum
    arr -> array
    sum -> sum
*/

import Basic.AO;

import java.util.HashMap;

public class SumOfSubArray {
    public static void main(String[] args) {
        int[] arr =  new int[] {10,15,-5,15,-10,5};
        int sum = 5;
        int ans[] = subArray(arr,sum);
        if(ans[0] == -1){
            System.out.println("NO sub array found");
        }else {
            for (int i = ans[0]; i < ans[1] + 1; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    static int[] subArray(int[] arr,int sum){
        int currentSum = 0;
        int start = 0;
        int end = -1;
        HashMap<Integer,Integer> CR = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            currentSum +=arr[i];
            if(currentSum-sum == 0){
                start = 0;
                end = i;
                break;
            }
            if(CR.containsKey(currentSum-sum)){
                start = CR.get(currentSum-sum)+1;
                end = i;
                break;
            }
            CR.put(currentSum,i);
        }
        return end==-1?new int[] {-1,-1}:new int[] {start,end};
    }
}
