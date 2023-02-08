package StarPattern;

public class LeftAngleTrianglePattern {

    public static void main(String[] args) {
        int n=5;
        System.out.println("Left angle triangle star pattern: ");
        for (int i=0;i<n;i++){
            for (int j=2*(n-i);j>=1;j--){
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
