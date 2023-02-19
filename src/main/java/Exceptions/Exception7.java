package Exceptions;

public class Exception7 {
    public static void main(String[] args) {
        try {
            try {
                try {
                    String s="abcde";
                    System.out.println(s.length());
                    int a[]={1,2,3};
                    System.out.println(a[4]);
                } catch (ArithmeticException e){
                    System.out.println("Arithmetic Exception:  Inner catch Block 2");
                }
            } catch (ArithmeticException e){
                System.out.println("Arithmetic Exception: Inner Catch Block 1");
            }
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Array Index Out of Bounds Exception: Outer Catch Block");
        } catch (Exception e){
            System.out.println("Parent Exception: Outer Try Block");
        }
    }
}
