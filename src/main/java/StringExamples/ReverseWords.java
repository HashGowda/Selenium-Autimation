package StringExamples;

public class ReverseWords {
    public static void main(String[] args) {
        reverseWords();
    }

    static void reverseWords(){
        String in ="This is a string, which needs to be tested";
        String[] words=in.split(" ");
        StringBuilder word = new StringBuilder();

        for (int i=words.length-1;i>=0;i--){
            word.append(words[i]);
            word.append(" ");
        }
        System.out.println(word.toString().trim());
    }
}
