package ArraysExamples;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenOddNumbers {

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        System.out.println("Odd number: ");
        for (int i=0;i<a.length;i++){
            if (a[i]%2!=0){
                System.out.println(a[i]);
            }
        }
        System.out.println("Even numbers: ");
        for (int i=0;i<a.length;i++){
            if (a[i]%2==0){
                System.out.println(a[i]);
            }
        }
    }
}
