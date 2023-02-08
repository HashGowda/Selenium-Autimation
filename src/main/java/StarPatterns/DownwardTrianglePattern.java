package StarPatterns;

public class DownwardTrianglePattern {

    public static void main(String[] args) {
        int n=5;
        System.out.println("Downward Triangle Pattern: ");

        //inner loop
        for (int i=n;i>=1;i--){

            //outer loop
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
