package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        String s []={"AA","BB","CC","DD"};
        List<String> list = Arrays.asList(s);
        System.out.println("From list : "+list);
        for (int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
