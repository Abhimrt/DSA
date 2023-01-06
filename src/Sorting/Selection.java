package Sorting;

import Basic.AO;

public class Selection {
    public static void main(String[] args) {
        int[] arr = AO.ins();
        for(int i=0; i<arr.length-1;i++){
            int temp = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[temp]){
                    temp = j;
                }
            }
            if(i!=temp) {
                AO.swap(arr, temp, i);
            }
        }
        AO.show(arr);
    }
}
