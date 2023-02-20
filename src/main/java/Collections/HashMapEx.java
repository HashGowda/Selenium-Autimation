package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    HashMap<String, Integer> enterValue(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        map.put("D",4);
        return map;
    }

    public static void main(String[] args) {
        HashMapEx h = new HashMapEx();
        System.out.println(h.enterValue());
        HashMap<String, Integer> map = h.enterValue();
        for (Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
