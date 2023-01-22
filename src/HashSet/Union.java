package HashSet;

import Basic.AO;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Union {
    public static void main(String[] args) {
        System.out.println("First list");
        List<Integer> first = AO.list();
        System.out.println("Second list");
        List<Integer> second = AO.list();
        Set<Integer> set = new HashSet<Integer>(first);
        set.addAll(second);
        System.out.println("Union of First = " +first);
        System.out.println("and Second = " +second);
        System.out.println("is = " +set);
    }
}
