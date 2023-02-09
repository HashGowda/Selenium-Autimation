package StringPattern;

public class ReverseTrianglePattern {

    public static void main(String[] args) {
        char c[] = {'P', 'R', 'O', 'G', 'R', 'A', 'M'};
        reverseTrianglePattern(c);
    }

    static void reverseTrianglePattern(char c[]) {
        System.out.println("Reverse triangle string pattern: ");
        for (int i = c.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c[j] + " ");
            }
            System.out.println();
        }
    }
}

