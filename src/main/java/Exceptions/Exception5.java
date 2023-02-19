package Exceptions;

public class Exception5 {

    //if you don't specify the exception it will catch parent exception

    public static void main(String[] args) {
        try {
            String s =null;
            System.out.println(s.length());
        } catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound exception");
        } catch (Exception e){
            System.out.println("Parent Exception");
        } int b=10;
        System.out.println(b);
    }
}
