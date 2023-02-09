package StringExamples;

public class LargestSmallest {

    public static void main(String[] args) {
        String input = "This is a string, which needs to be checked";
        largestSmallest(input);
    }

    static void largestSmallest(String input){
        String[] words = input.split(" ");
        String smallest = words[0];
        String largest = words[0];
        for (String word : words){
            if (word.length()<smallest.length()){
                smallest=word;
            }
            if (word.length()>largest.length()){
                largest=word;
            }
        }
        System.out.println("Smallest word: "+smallest);
        System.out.println("Largest word: "+largest);
    }
}
