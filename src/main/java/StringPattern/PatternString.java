package StringPattern;

public class PatternString {
    public static void main(String[] args) {
        downwardTrianglePattern();
        rightAngleTrianglePattern();
        rightTrianglePattern();
        }

    static void downwardTrianglePattern(){
        char c[] = {'P', 'R', 'O', 'G', 'R', 'A', 'M'};
        System.out.println("Downward Triangle Pattern:");
        for (int i=c.length-1;i>=0;i--){
            for (int j=0;j<=i;j++){
                System.out.print(c[j]+" ");
            }
            System.out.println();
        }
    }
    static void rightAngleTrianglePattern(){
        char c[]={'P','R','O','G','R','A','M'};
        System.out.println("\nRight Angle Triangle Pattern:");
        for (int i=0;i<c.length;i++){
            for (int j=0;j<c.length;j++){
                System.out.print(c[j]+" ");
            }
            System.out.println();
        }
    }

    static void rightTrianglePattern(){
        char c[]={'P','R','O','G','R','A','M'};
        System.out.println("\nRight Triangle Pattern:");
        for (int i=0;i<c.length;i++){
            for (int j=0;j<=i;j++){
                System.out.print(c[j]+" ");
            }
            System.out.println();
        }
    }
}
