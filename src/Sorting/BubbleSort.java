package Sorting;

import Basic.AO;

//one by one iterate and swap if the number is large
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = AO.ins();
        for(int i=0;i<arr.length;i++){
            boolean isSwap = false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    AO.swap(arr,j,j+1);
                    isSwap=true;
                }
            }
            if(!isSwap){
                break;
            }
        }
        AO.show(arr);
    }
}
