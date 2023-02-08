package StarPatterns;

public class LeftAngleTrianglePattern {

    public static void main(String[] args) {
        int n=5;
        System.out.println("Left Angle Triangle Pattern: ");


        //outer loop for rows
        for (int i=0;i<n;i++){

            //inner loop works for space
            for (int j=2*(n-i);j>=1;j--){
                System.out.print(" ");
            }

            //inner loop for columns
            for (int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
