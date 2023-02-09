package ArraysExamples;

import java.util.Arrays;

public class AddElement {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        addElement(a);
    }

    static void addElement(int a[]){
        int n=a.length;
        int newA[]= new int[n+1];
        int value=7;
        System.out.println("Array before: "+Arrays.toString(a));
        for (int i=0;i<n;i++){
            newA[i]=a[i];
        }
        newA[n]=value;
        System.out.println("Array after: "+Arrays.toString(newA));
    }
}
