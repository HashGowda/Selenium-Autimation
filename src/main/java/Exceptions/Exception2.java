package Exceptions;

public class Exception2 {
    void add(){
        try {
            int []a={1,2,3,4};
            System.out.println(a[4]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception is handled");
            e.printStackTrace();
        }
    }
    void display(){
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e){
            System.out.println("Exception handled");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Exception2 ex = new Exception2();
        ex.add();
        ex.display();
    }
}
