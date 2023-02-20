package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx2 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("apple");
        list1.add("cat");
        list1.add("dog");
        list1.add("ball");

        System.out.println("Before sort : "+list1);
        Collections.sort(list1);
        System.out.println("After sort : "+list1);
        for (String s :list1){
            System.out.println(s);
        }
        System.out.println("Size of list1 : "+list1.size());
        System.out.println("*******************");

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(0);
        list2.add(4);
        list2.add(3);
        list2.add(7);
        list2.add(6);

        System.out.println("Before sort : "+list2);
        Collections.sort(list2);
        System.out.println("After sort : "+list2);
        for (int s:list2){
            System.out.println(s);
        }
        System.out.println("Size of list2 : "+list2.size());
    }
}
