package ArraysExamples;

import java.util.Arrays;

public class SmlLarElement {

    public static void main(String[] args) {
        int a[] = {55, 10, 8, 90, 43, 87, 95, 25, 50, 12};
        smallLargeElement(a);
    }

    static void smallLargeElement(int a[]){
        int n;
        System.out.println("Array: "+Arrays.toString(a));
        int l=a.length;
        for (int i=0;i<l;i++){
            for (int j=i+1;j<l;j++){
                if (a[i]>a[j]){
                    n=a[i];
                    a[i]=a[j];
                    a[j]=n;
                }
            }
        }
        System.out.println("Smallest: "+a[0]);
        System.out.println("Second smallest: "+a[1]);
        System.out.println("Largest: "+a[l-1]);
        System.out.println("Second largest: "+a[l-2]);
    }
}
