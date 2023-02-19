package Exceptions;

public class Exception4 {
    public static void main(String[] args) {
        try {
            int a[]={1,2,3,4,5};
            System.out.println(a[5]);
            int b=10/0;
            System.out.println(b);
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
