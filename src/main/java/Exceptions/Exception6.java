package Exceptions;

public class Exception6 {

    //Nested try

    public static void main(String[] args) {
        try {
            try {
                int a[]={1,2,3};
                System.out.println(a[4]);
            } catch (ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
                System.out.println("Handled array index out of bounds exception");
            } try {
                String b=null;
                System.out.println(b.length());
            } catch (ArithmeticException e){
                System.out.println(e);
                System.out.println("Arithmetic Exception");
            }
        } catch (ArithmeticException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Handled parent exception");
        }
        int c=10;
        System.out.println(c);
    }
}
