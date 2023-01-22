package Basic;

import java.util.*;

public class AO {
//    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12
    // retrun array after taking the value
    static Scanner s = new Scanner(System.in);
    public static int[] ins(){
        System.out.print("Enter the length of the array:- ");
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter "+(i+1)+" element: - ");
            arr[i] = s.nextInt();
        }
        return arr;
    }
    public static void show(int arr[]){
            System.out.println("arr = " + Arrays.toString(arr));
    }

    public static void swap(int arr[] , int i,int j){
        if(arr[i]!=arr[j]){
            arr[i] = arr[i]^arr[j];
            arr[j] = arr[i]^arr[j];
            arr[i] = arr[i]^arr[j];
        }
    }

    public static List<Integer> list(){
        System.out.print("Enter the length of the List:- ");
        List<Integer> temp = new ArrayList<Integer>();
        int n = s.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" element: - ");
            temp.add(s.nextInt());
        }
        return temp;
    }
}
