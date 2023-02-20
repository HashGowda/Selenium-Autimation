package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    List<String> getNames() {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("ball");
        list.add("cat");
        list.add("dog");
        return list;
    }
    void getNumbers(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
    }
    ArrayList<Integer> ReturnNumbers(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(2);
        return list;
    }
    String name(){
        String name="nhffj";
        return name;
    }

    public static void main(String[] args) {
        ListEx lst = new ListEx();
        System.out.println(lst.getNames());
        List<String> s= lst.getNames();
        String name=lst.name();
        ArrayList<Integer> numbers = lst.ReturnNumbers();
        System.out.println(numbers);
    }
}
