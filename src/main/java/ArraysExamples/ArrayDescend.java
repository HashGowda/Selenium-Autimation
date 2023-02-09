package ArraysExamples;

public class ArrayDescend {

    public static void main(String[] args) {
        int a[] = new int[]{5, 2, 8, 7, 1};
        arrayDescend(a);
    }

    static void arrayDescend(int a[]){
        int temp=0;

        System.out.println("Original elements of an array: ");
        for (int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println();

        System.out.println("Elements of an array after descending: ");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
