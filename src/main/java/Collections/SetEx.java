package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {
    void values(){
        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(34);
        set.add(56);
        set.add(89);
        System.out.println("From hashSet:"+set);
    }
    Set<Integer> getValues(){
        Set<Integer> set = new TreeSet<>();
        set.add(12);
        set.add(54);
        set.add(34);
        set.add(96);
        return set;
    }

    public static void main(String[] args) {
        SetEx s = new SetEx();
        System.out.println("From TreeSet "+s.getValues());
        s.getValues();
        Set<Integer> values=s.getValues();
//        System.out.println("From HashSet "+s.values());
//        s.values();
//        Set<Integer> val=s.values();
    }
}
