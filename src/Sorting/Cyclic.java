package Sorting;

import Basic.AO;

public class Cyclic {
    public static void main(String[] args) {
        int[] arr = AO.ins();
        int i = 0;
        while(i < arr.length) {
            if (arr[i] != i + 1) {
                AO.swap(arr, i, arr[i] - 1);
            }else{
                i++;
            }
        }
        AO.show(arr);
    }
}
