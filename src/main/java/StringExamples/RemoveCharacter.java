package StringExamples;


public class RemoveCharacter {

    public static void main(String[] args) {
        String in = "coderolls";
        char c ='o';
        removeCharacter(in, c);
    }

    public static void removeCharacter(String in , char c){
        String result = in.replace("o", "");
        System.out.println("After removing character "+c+" from the input string "+in+" the result will be "+result);
    }
}
