package ArraysExamples;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {

        //Removing an element from Array using for loop

//        int a[]={25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
//        System.out.println("Original array: "+ Arrays.toString(a));
//        int removeIndex = 1;
//        for (int i=removeIndex;i<a.length-1;i++){
//            a[i]=a[i+1];
//        }
//        System.out.println("Array after removing: "+Arrays.toString(a));
//    }
//}

        //By using index of an element

                int[] arr = new int[]{1,2,3,4,5};
                int []arr_new = new int[arr.length-1];
                int j=3;
                for (int i=0, k=0;i<arr.length;i++){
                    if (i!=j){
                        arr_new[k]=arr[i];
                        k++;
                    }
                }
                System.out.println("Before deletion: " + Arrays.toString(arr));
                System.out.println("After deletion: " + Arrays.toString(arr_new));
            }
        }


        //By using value of an element

//                int[] arr = new int[]{1,2,3,4,5};
//                int[] arr_new = new int[arr.length-1];
//                int j=3;
//                for(int i=0, k=0;i<arr.length;i++){
//                    if(arr[i]!=j){
//                        arr_new[k]=arr[i];
//                        k++;
//                    }
//                }
//                System.out.println("Before deletion :" + Arrays.toString(arr));
//                System.out.println("After deletion :" + Arrays.toString(arr_new));
//
//            }
//        }

