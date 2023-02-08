package StarPattern;

public class PyramidPattern {

    public static void main(String[] args) {
        int n=3;
        System.out.println("Pyramid Star Pattern: ");

        //i for rows and j for columns
        //outer loop works for rows
        for (int i=0; i<=n;i++){

            //inner loop works for space
            for (int j=n;j>=1;j--){
                System.out.print(" ");
            }

            //inner loop works for columns
            for (int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
