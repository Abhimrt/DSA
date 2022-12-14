package Search;

import Basic.AO;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("'Enter sorted array for binary search'");
        int[] arr = AO.ins();
        System.out.print("Enter target element: - ");
        int target = s.nextInt();
        System.out.println("Target found at: - "+(binary(arr,0,arr.length-1,target)+1));
    }
    static int binary(int arr[],int s,int e,int target){
        if(s>e){
            return -2;
        }
        int mid = s+((e-s)/2);
        if(arr[mid]==target){
            return mid;
        }else if(arr[mid]>target){
            e = mid-1;
            return binary(arr,s,e,target);
        }else{
            s=mid+1;
            return binary(arr,s,e,target);
        }
    }
}
