package StringExamples;

public class UniqueWords {

    public static void main(String[] args) {
        String a =" welcome to geeks for geeks";
        uniqueWords(a);
    }

    static void uniqueWords(String a){
        int count;
        String [] words =a.split(" ");
        System.out.println("Unique words are");
        for (int i=0;i<words.length;i++){
            count=1;
            for (int j=i+1;j<words.length;j++){
                if (words[i].equalsIgnoreCase(words[j])){
                    count++;
                    words[j]=" ";
                }
            }

            if (count==1 && words[i]!=" ")
                System.out.println(words[i]);
        }
    }
}
