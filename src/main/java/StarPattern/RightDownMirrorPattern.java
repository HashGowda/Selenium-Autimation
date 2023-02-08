package StarPattern;

public class RightDownMirrorPattern {
    public static void main(String[] args) {
        int n=5;
        System.out.println("Right Down Mirror Star Pattern: ");
        for (int i=n;i>=1;i--){
            for (int j=n;j>i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
