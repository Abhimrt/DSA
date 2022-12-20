package Arrays;

import Basic.AO;

// in this problem we find out that how much water is stored between buildings
/*
arr = [3,1,2,4,0,1,3,2]

              |
        | * * | * * |
        | * | | * * | |
        | | | | * | | |
arr     3 1 2 4 0 1 3 2
leftMax 3 3 3 4 4 4 4 4
        4 4 4 4 3 3 3 2 rightMax
min-i   0 2 1 0 3 2 0 0
formula ans += min(left(i),right(i)) - a[i];
    ans  = 8
 */
public class RainWaterTrapping {
    public static void main(String[] args) {
        int[] arr = AO.ins();
        System.out.println("Maximum water trap = "+maxWater(arr));
    }

    static int maxWater(int[] arr){
        int[] right = new int[arr.length];
        right[arr.length-1] = arr[arr.length-1];
        for(int i = arr.length-2;i>-1;i--){
            right[i] = Math.max(arr[i],right[i+1]);
        }
        int leftMax = 0;
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            leftMax = Math.max(leftMax,arr[i]);
            ans += Math.min(right[i],leftMax) - arr[i];
        }
        return ans;
    }
}
