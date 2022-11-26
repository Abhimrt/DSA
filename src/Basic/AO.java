package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class AO {
    public static void ins(int arr[], int n){
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Enter "+(i+1)+" element: - ");
            arr[i] = s.nextInt();
        }
    }
    public static void show(int arr[]){
            System.out.println("arr = " + Arrays.toString(arr));
    }
}
