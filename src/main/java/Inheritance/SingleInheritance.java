package Inheritance;

public class SingleInheritance {

    void addition(int a, int b) {
        int sum = a + b;
        System.out.println("Addition: " + sum);
    }
}

    class Sub extends SingleInheritance{
        void subtraction(int a, int b){
            int sub=a-b;
            System.out.println("Subtraction: "+sub);
        }
    }
class Simple{
        public static void main(String[] args) {
            Sub s =new Sub();
            s.subtraction(20,10);
            s.addition(10,5);
        }
}
