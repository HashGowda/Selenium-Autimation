package StarPattern;

public class RightAngleTrianglePatter {

    public static void main(String[] args) {
        int n=5;
        System.out.println("Right angle triangle star pattern: ");
        for (int i=0; i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
