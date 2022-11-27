package Search;

import Basic.AO;

import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = AO.ins();
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
