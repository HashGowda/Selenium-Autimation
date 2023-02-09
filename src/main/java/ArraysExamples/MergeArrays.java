package ArraysExamples;

public class MergeArrays {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        int b[] = {5, 6, 7, 8};
        mergeArrays(a,b);
    }

        static void mergeArrays(int a[], int b[]){
        int c[]=new int[a.length+b.length];

        for (int i=0;i<a.length;i++){
            c[i]=a[i];
        }

        for (int i=0;i<b.length;i++){
            c[i+a.length]=b[i];
        }

        System.out.println("Merged array: ");
        for (int i=0; i<(a.length+b.length);i++){
            System.out.print(c[i]+" ");
        }
    }
}
