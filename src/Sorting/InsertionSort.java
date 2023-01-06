package Sorting;

import Basic.AO;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = AO.ins();
        for(int i =1;i<arr.length;i++){
            int temp = arr[i];
            int j = i-1;
            while (j>=0 && temp<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        AO.show(arr);
    }
}
