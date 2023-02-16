package ImpPrograms;

public class BubbleSort {
    static void bubbleSort(int a[]){
        int n=a.length;
        int temp=0;
        for (int i=0; i<n;i++){
            for (int j=1;j<(n-i);j++){
                if (a[j-1]>a[j]){
                    temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[]={3,60,35,2,45,320,5};

        System.out.println("Array before bubble sort");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        bubbleSort(a);

        System.out.println("\nArray after bubble sort");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
