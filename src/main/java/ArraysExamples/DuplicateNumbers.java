package ArraysExamples;

public class DuplicateNumbers {
    public static void main(String[] args) {
        int a[]={2,3,4,5,2,3,4,6,5};
        duplicateNumbers(a);
    }

    static void duplicateNumbers(int a[]){
        System.out.println("Duplicate numbers: ");
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++) {
                if (a[i] == a[j])
                    System.out.println(a[i]);
            }
        }
    }
}
