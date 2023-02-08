package StarPatterns;

public class RightAngleTrianglePattern {

    public static void main(String[] args) {

        int n=5;
        System.out.println("Right Angle Triangle Pattern: ");

        //inner loop for rows
        for (int i=0; i<n;i++){

            //inner loop for columns
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
