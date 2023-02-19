package Exceptions;

public class ArthmtcException extends Throwable {
    public static void main(String[] args) {
        int a=12, b=29;
        System.out.println(a+b);
        int c=90,d=49;
        System.out.println(c-d);
        int f=4, g=5;
        System.out.println(f*g);
        try {
            int x=10, y=0;
            System.out.println(x/y);
        } catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("Exception is handled");
        }
        int i=100, j=200;
        System.out.println(i+j);
        int k=200, l=100;
        System.out.println(k-l);
    }
}
