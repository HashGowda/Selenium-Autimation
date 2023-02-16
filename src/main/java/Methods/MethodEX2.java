package Methods;

public class MethodEX2 {
    int add(int a, int b){
        int sum=a+b;
        return sum;
    }
    int sub(int a, int b){
        int sub=a-b;
        return sub;
    }
    void multiply(int a, int b){
        int mul=a*b;
        System.out.println("Multiplication: "+mul);
    }
    int div(int a, int b){
        int div=a/b;
        return div;
    }

    public static void main(String[] args) {
        MethodEX2 m = new MethodEX2();
        int input1=m.add(10,20);
        System.out.println("Addition: "+input1);
        int input2=m.sub(20,10);
        System.out.println("Subtraction: "+input2);
        m.multiply(input1, input2);

        int result=m.div(input1, input2);
        System.out.println("Division: "+result);
        System.out.println("Division: "+m.div(input1, input2));
    }
}
