package Collections.List;

import java.util.LinkedList;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<String> list = new java.util.ArrayList<>();  // ArrayList
        list.add("Hello");
        list.add("World");          //Duplicates will be allowed
        System.out.println(list);

        List<Integer> list2 = new LinkedList<>();           // Linked ArrayList
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println(list2);

    }
}
