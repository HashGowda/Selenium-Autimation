package Collections;

import java.util.ArrayList;

public class ArrayListEx3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("ball");
        list.add("cat");
        list.add("dog");
        System.out.println("Before sort : "+list);
        System.out.println(list.get(1));
        list.set(1,"Animal");
        list.add(2,"fish");
        for (String s : list){
            System.out.println(s);
        }
    }
}
