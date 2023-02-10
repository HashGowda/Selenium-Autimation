package StringExamples;

public class DuplicateWords {

    public static void main(String[] args) {
        String input = "This is one String, which needs to be tested for duplicate word, is one";
        duplicateWords(input);
    }

    public static void duplicateWords(String input){
        String[] output = input.split(" ");
        int count=1;
        System.out.println("Duplicates words in a given string:");
        for (int i=0;i<output.length;i++){
            for (int j=i+1;j<output.length;j++){
                if (output[i].equals(output[j])){
                    count+=1;
                    output[j]="0";
                }
            }

            //count>1
            if (output[i]!="0"){
                System.out.println(output[i]+" = "+count);
                count=1;
            }
        }
    }
}
