package Exceptions;

public class Exception8 {

    //Finally

    public static void main(String[] args) {
        try {
            int a=10/0;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Arithmetic Exception Handled");
        } finally {
            System.out.println("Finally Block is always executed");
        }
        int b=10;
        System.out.println(b);
    }
}
