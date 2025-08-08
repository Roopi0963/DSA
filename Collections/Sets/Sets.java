package Collections.Sets;

import java.util.*;

public class Sets {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();      // Unordered and No Duplicates allowed
        set.add("Hello");
        set.add("World");
        set.add("Hello");
        System.out.println(set);

        Set<Integer> set2 = new HashSet<>();  // Unordered and No Duplicates allowed
        set2.add(1);
        set2.add(4);
        set2.add(3);
        System.out.println(set2);

        Set<Integer> set4 = new LinkedHashSet<>();  // Unordered and No Duplicates allowed
        set4.add(1);
        set4.add(4);
        set4.add(3);
        System.out.println(set4);

        Set<Integer> set3 = new TreeSet<>();       // Sorted and No Duplicates allowed
        set3.add(10);
        set3.add(2);
        set3.add(1);
        set3.add(30);
        set3.add(14);
        System.out.println(set3);
    }
}
