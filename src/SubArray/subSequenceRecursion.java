package SubArray;
/*
*   we were printing the arrays non-continuous subsequence
*
* */
import java.util.ArrayList;

public class subSequenceRecursion {
    public static void main(String[] args) {
        int[] arr =  new int[] {1,2,3};
        subArray(0,arr,new ArrayList<>());
    }
    static void subArray(int index, int[] arr, ArrayList<Integer> list){
        if(index >= arr.length){
            System.out.println(list);
            return;
        }
        list.add(arr[index]);
        subArray(index+1,arr,list);
        list.remove(list.size()-1);
        subArray(index+1,arr,list);
    }
}
