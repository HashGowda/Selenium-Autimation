package Exceptions;

public class Exception1 {
    public static void main(String[] args) {
        try {
            int a=10/0;
        } catch (Exception e){
            System.out.println("Catch block is executed");
            e.printStackTrace();
        }
        int b=20;
        System.out.println(b);
    }
}
