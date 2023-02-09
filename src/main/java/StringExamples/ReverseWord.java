package StringExamples;

public class ReverseWord {

    public static void main(String[] args) {
        String input = "This is a string";
        reverseWord(input);
    }

    static void reverseWord(String input){
        String[] words = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words){
            sb.append(new StringBuilder(word).reverse().toString()+" ");
        }
        System.out.println("Results: "+sb.toString().trim());
    }
}
