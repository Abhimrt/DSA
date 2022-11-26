package Search;

import Basic.AO;

import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of the array:- ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("'Enter sorted array for binary search'");
        AO.ins(arr,n);
        System.out.print("Enter target element: - ");
        int target = s.nextInt();
//        System.out.println("Target found at: - "+(linear(arr,0,n-1,target)+1));
    }
}
