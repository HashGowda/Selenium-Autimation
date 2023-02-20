package ImpPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsDuplicate {
    public static void main(String[] args) {
        wordsDuplicate();
    }

    static void wordsDuplicate(){
        String in ="This is a string and this string needs to be tested";
        String out[]=in.split(" ");
        Set<String> wordSet = new HashSet<>();
        List<String> duplicates = new ArrayList<>();
        for (String word:out){
            if (!wordSet.add(word)){
                duplicates.add(word);
            }
        }
        System.out.println("Duplicate words : "+duplicates);
    }
}
