package StringPattern;

public class RightAngleTrianglePattern {

    public static void main(String[] args) {
        char c[] = {'P', 'R', 'O', 'G', 'R', 'A', 'M'};
        rightAngleTrianglePattern(c);
    }

        static void rightAngleTrianglePattern(char c[]){
        System.out.println("Right angle triangle string pattern: ");
        for (int i=0;i<c.length;i++){
            for (int j=0;j<=i;j++){
                System.out.print(c[j]+" ");
            }
            System.out.println();
        }
    }
}
