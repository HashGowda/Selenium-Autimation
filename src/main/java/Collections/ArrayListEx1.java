package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("ball");
        list.add("cat");
        list.add("dog");
        System.out.println("Size : "+list.size());
        System.out.println(list);
        System.out.println("Get value : "+list.get(3));
        System.out.println("\nBy using for each loop");
        for (String s : list){
            System.out.println(s);
        }

        System.out.println("\nBy using iterator");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
