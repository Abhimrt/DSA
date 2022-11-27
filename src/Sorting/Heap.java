package Sorting;

import Basic.AO;

public class Heap {
    public static void main(String[] args) {
        int arr[]=AO.ins();
        heap(arr);
        AO.show(arr);
    }

// ===================== heap sort =========================
    static void heap(int[] arr){
        for(int i=(arr.length/2);i>=0;i--) {
            heapify(arr, arr.length, i);
        }
        for(int i = arr.length-1;i>0;i--){
            AO.swap(arr,0,i);
            heapify(arr,i,0);
        }
    }

//   ======================= heapify =======================
    static void heapify(int arr[],int n, int i){
        int left = 2*i+1;
        int right = 2*i+2;
        int lar = i;
        if(left<n && arr[left]>arr[lar]){
            lar = left;
        }
        if(right<n && arr[right]>arr[lar]){
            lar = right;
        }
        if(lar!=i){
            AO.swap(arr,i,lar);
            heapify(arr,n,lar);
        }
    }
}
