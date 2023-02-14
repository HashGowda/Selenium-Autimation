package Constructors;

public class StudentA {

    //To invoke the current class method
    void add(){
        int a=10;
        int b=20;
        int sum=a+b;
        System.out.println("Sum: "+sum);
    }
    void multiply(){
        int a=3;
        int b=2;
        int mul=a*b;
        System.out.println("Multiply: "+mul);
        add();
    }

    public static void main(String[] args) {
        StudentA s= new StudentA();
        s.multiply();
    }
}
