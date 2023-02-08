package StarPattern;

public class ReversePyramidPattern {

    public static void main(String[] args) {

        //First method
//        int n=5;
//        System.out.println("Reverse pyramid star pattern: ");
//        for (int i=0;i<=n-1;i++){
//            for (int j=0;j<=i;j++){
//                System.out.print(" ");
//            }
//            for (int k=0;k<=n-1-i;k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}

        //Second method
        int n = 5;
        System.out.println("Right Down Mirror Star Pattern: ");
        for (int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
