package Sorting;

import Basic.AO;
// works on partitioning logic
//best case O(n log(n))
//worst case O(n^2)
//space complexity  O(n)
public class Quick {
    public static void main(String[] args) {
        int[] arr = AO.ins();
        quickSort(arr , 0,arr.length-1);
        AO.show(arr);
    }

    static void quickSort(int[] arr,int first,int last){
        if(first<last){
            int pivot = partition(arr,first,last);
            quickSort(arr , pivot+1, last);
            quickSort(arr , first, pivot-1);
        }
    }
    static int partition(int[] arr,int first, int last){
        int pivot = arr[first];
        int i = first, j = last;
        while (i<j){
            while( i<arr.length && arr[i]<=pivot ) i++;
            while(j>-1 && arr[j]>pivot  ) j--;
            if(i<j){
                AO.swap(arr,i,j);
            }
        }
        AO.swap(arr,j,first);
        return j;
    }
}
