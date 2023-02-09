package ArraysExamples;

public class SplitArray {

    public static void main(String[] args) {

        //initialize an array
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8};
        splitArray(a);
    }

        static void splitArray ( int a[]){
            int n = a.length;
            int pos = 4;
            int b[] = new int[pos];
            int c[] = new int[n - pos];

            System.out.print("Elements of an array: ");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }

            //add first 4 elements to new array
            System.out.println();
            for (int i = 0; i < pos; i++) {
                b[i] = a[i];
            }
            System.out.print("First half: ");
            for (int i = 0; i < pos; i++) {
                System.out.print(b[i] + " ");
            }

            //add last 4 elements to new array
            System.out.println();
            int k = 0;
            for (int i = pos; i < n; i++) {
                c[k] = a[i];
                k++;
            }
            System.out.print("Second half: ");
            for (int i = 0; i < n - pos; i++) {
                System.out.print(c[i] + " ");
            }
        }
    }
