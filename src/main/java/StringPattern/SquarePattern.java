package StringPattern;

public class SquarePattern {

    public static void main(String[] args) {
        System.out.println("Square string pattern: ");
        char c[]={'P','R','O','G','R','A','M'};
        for (int i=0;i<c.length;i++){
            for (int j=0;j<c.length;j++){
                System.out.print(c[j]+" ");
            }
            System.out.println();
        }
    }
}
