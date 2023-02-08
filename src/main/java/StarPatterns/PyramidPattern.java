package StarPatterns;

public class PyramidPattern {

    public static void main(String[] args) {
        int n=3;
        System.out.println("Pyramid Pattern: ");

        //i for rows and j for columns
        //outer loop works for rows
        for (int i=0;i<=n;i++){

            //inner loop works for space
            for (int j=n;j>=i;j--){

                //print the space between two stars
                System.out.print(" ");
            }

            //inner loop for columns
            for (int k=0;k<=i;k++){

                //print star
                System.out.print("* ");
            }

            //throws the cursor in a new line after printing each line
            System.out.println();
        }
    }
}
