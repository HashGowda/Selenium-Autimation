package StringPattern;

public class SquarePattern {

    public static void main(String[] args) {
        char c[] = {'P', 'R', 'O', 'G', 'R', 'A', 'M'};
        squarePattern(c);
    }

    static void squarePattern(char[]c){
        System.out.println("Square string pattern: ");
        for (int i=0;i<c.length;i++){
            for (int j=0;j<c.length;j++){
                System.out.print(c[j]+" ");
            }
            System.out.println();
        }
    }
}
