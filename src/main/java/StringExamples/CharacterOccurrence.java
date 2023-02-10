package StringExamples;

public class CharacterOccurrence {

    public static void main(String[] args) {
        String in = "coderolls";
        characterOccurrence(in);
    }

    public static void characterOccurrence(String in){
        char ch = 'o';
        int count =0;
        for (int i=0;i<in.length();i++){
            if (in.charAt(i)==ch){
                count++;
            }
        }
        System.out.println("The character "+ch+" found "+count+" times in a string "+in);
    }
}
