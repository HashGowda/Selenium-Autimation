package ArraysExamples;

public class ArrayAscend {

    public static void main(String[] args) {
        int a[] = new int[]{5, 2, 8, 7, 1};
        arrayAscend(a);
    }

    static void arrayAscend(int a[]){
        int temp=0;

        //displaying original elements of an array
        System.out.println("Original elements of an array: ");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        //sorting the array in ascending order
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++) {
                if (a[i] > a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println();

        //displaying sorted array
        System.out.println("Elements of an array after sorting: ");
        for (int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
