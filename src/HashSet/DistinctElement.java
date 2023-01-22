package HashSet;

import Basic.AO;

import java.util.*;

public class DistinctElement {
    public static void main(String args[])
    {
        int[] arr = AO.ins();
        Set<Integer> dis = new HashSet<Integer>();
        for(int i:arr){
            dis.add(i);
        }
        System.out.println("Distinct element array : "+dis);
    }
}
