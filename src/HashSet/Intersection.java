package HashSet;

import Basic.AO;

import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        System.out.println("First list");
        List<Integer> first = AO.list();
        System.out.println("Second list");
        List<Integer> second = AO.list();
        Set<Integer> set = new HashSet<Integer>(first);
        set.retainAll(second);
        System.out.println("Intersection of First = " +first);
        System.out.println("and Second = " +second);
        System.out.println("is = " +set);
    }
}
