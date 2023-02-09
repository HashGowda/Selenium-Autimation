package ArraysExamples;

public class LargestTwoElement {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        largestTwoElement(a);
        int b[] = {10, 20, 25, 63, 96, 57};
        largestElement(b);
    }

    static void largestTwoElement(int a[]) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            } else if (a[i] > secondLargest) {
                secondLargest = a[i];
            }
        }
        System.out.println("Largest element in an array: " + largest);
        System.out.println("Second largest element in an array: " + secondLargest);
    }


    static void largestElement(int a[]){
        int t, l;
        l=a.length;
        for (int i=0;i<l;i++){
            for (int j=i+1;j<l;j++){
                if (a[i]>a[j]){
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        System.out.println("Largest: "+a[l-1]);
        System.out.println("Second largest: "+a[l-2]);
    }
}
