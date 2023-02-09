package StringExamples;

import java.util.Scanner;

public class RemoveCharacters {

    public static void main(String[] args) {
        String input = "This is a string, which needs to be removed";
        String output = "itoT";
        removeCharacters(input, output);
    }

    static void removeCharacters(String input, String output) {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if (output.indexOf(c)==-1){
                sb.append(c);
            }
        }
        System.out.println("Results: "+sb);
    }
}




