package ImpPrograms;

public class DuplicateWordsCount {
    public static void main(String[] args) {
        duplicateWordsCount();
    }

    static void duplicateWordsCount(){
        String in = "String should be within double quotes and be String";
        int count=1;
        String out[]=in.split(" ");
        System.out.println("Duplicate words count in a string");
        for (int i=0;i<out.length;i++){
            for (int j=i+1;j<out.length;j++){
                if (out[i].equals(out[j])){
                    count+=1;
                    out[j]="0";
                }
            }

            //if count>1;

            if (out[i]!="0"){
                System.out.println(out[i]+" = "+count);
                count=1;
            }
        }
    }
}
