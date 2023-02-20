package Collections;

import java.util.ArrayList;

public class ArrayListEx5 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("apple");
        list1.add("ball");
        list1.add("cat");
        list1.add("dog");
        System.out.println("List1 : "+list1);

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("fish");
        list2.add("bat");
        System.out.println("List2 : "+list2);

        list1.addAll(list2);
        System.out.println("Adding list2 to list1 : "+list1);

        list2.addAll(list1);
        System.out.println("Adding list1 to list2 : "+list2);
    }
}
