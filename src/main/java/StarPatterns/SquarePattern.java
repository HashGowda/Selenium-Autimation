package StarPatterns;

public class SquarePattern {

    public static void main(String[] args) {

        int n=3;
        System.out.println("Square pattern: ");
        for (int i=0;i<=n;i++){
            for (int j=0;j<=n;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
