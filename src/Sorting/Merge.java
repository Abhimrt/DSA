package Sorting;

import Basic.AO;

public class Merge {
    public static void main(String[] args) {
        int arr[]= AO.ins();
        mergeSort(arr,0,arr.length-1);
        AO.show(arr);
    }
//  ======================== merge sort ========================
    static void mergeSort(int arr[],int left,int right){
        if(left<right){
            int mid = left + (right-left)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }

//    ======================== merge ========================
    static void merge(int arr[],int left,int mid,int right){
        int temp[] = new int[right-left+1];
        int i = left;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=right) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k]=arr[i];
            k++;i++;
        }
        while(j<=right){
            temp[k]=arr[j];
            k++;j++;
        }
        i = left;
        for (int t:temp) {
            arr[i] = t;
            i++;
        }
    }
}
