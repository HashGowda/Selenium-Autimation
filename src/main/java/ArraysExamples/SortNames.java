package ArraysExamples;

public class SortNames {

    public static void main(String[] args) {
        String names[] = {"Rahul", "Ajay", "Gourav", "Riya"};
        sortNames(names);
    }


        static void sortNames(String[] names){
        String temp;
        for (int i=0;i<names.length;i++){
            for (int j=i+1;j<names.length;j++){
                if (names[i].compareTo(names[j])>0){
                    temp=names[i];
                    names[i]=names[j];
                    names[j]=temp;
                }
            }
        }

        System.out.println("After sorting: ");
        for (int i=0;i< names.length;i++){
            System.out.print(names[i]+" ");
        }
    }
}
