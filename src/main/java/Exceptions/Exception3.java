package Exceptions;

public class Exception3 {
    public static void main(String[] args) {
        try {
            int i = 10 / 1;
            System.out.println(i);
            int a[] = {1, 2, 3, 4};
            System.out.println(a[2]);
            String s = null;
            System.out.println(s.length());
        } catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception");
        } catch (Exception e){
            System.out.println("Parent Exception");
        }
        int b=10;
        System.out.println(b);
    }
}
