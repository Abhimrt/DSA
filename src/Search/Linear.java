package Search;

import Basic.AO;

import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of the array:- ");
        int n = s.nextInt();
        int[] arr = new int[n];
        AO.ins(arr,n);
        System.out.print("Enter target element: - ");
        int target = s.nextInt();
        System.out.println("Target found at: - "+(linear(arr,target)+1));
    }
    static int linear(int arr[],int target){
        for (int i=0;i<arr.length;i++) {
            if(arr[i]==target) {
                return i;
            }
        }
        return -2;
    }
}
