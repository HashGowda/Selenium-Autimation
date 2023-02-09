package ArraysExamples;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
        int a[]={25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int[] b = new int[]{1,2,3,4,5};
        int[] c = new int[]{1,2,3,4,5};
        removeElement(a);
        removeElementByIndex(b);
        removeElementByValue(c);
    }

        //Removing an element from an Array using for loop
    static void removeElement(int a[]){
        System.out.println("Removing an element from an array using for loop:");
        System.out.println("Original array: "+ Arrays.toString(a));
        int removeIndex = 1;
        for (int i=removeIndex;i<a.length-1;i++){
            a[i]=a[i+1];
        }
        System.out.println("Array after removing: "+Arrays.toString(a));
    }


    //By using index of an element
    static void removeElementByIndex(int b[]){
                int []arr_new = new int[b.length-1];
                int j=3;
                for (int i=0, k=0;i<b.length;i++){
                    if (i!=j){
                        arr_new[k]=b[i];
                        k++;
                    }
                }
        System.out.println("\nRemoving an element by using index of an element:");
                System.out.println("Before deletion: " + Arrays.toString(b));
                System.out.println("After deletion: " + Arrays.toString(arr_new));
            }



        //By using value of an element
    static void removeElementByValue(int[]c){

                int[] arr_new = new int[c.length-1];
                int j=3;
                for(int i=0, k=0;i<c.length;i++){
                    if(c[i]!=j){
                        arr_new[k]=c[i];
                        k++;
                    }
                }
        System.out.println("\nRemoving an element by using value of an element:");
                System.out.println("Before deletion :" + Arrays.toString(c));
                System.out.println("After deletion :" + Arrays.toString(arr_new));
            }
        }

