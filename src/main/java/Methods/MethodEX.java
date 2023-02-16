package Methods;

import java.lang.reflect.Method;

public class MethodEX {
    public void add(){
        int a=10;
        int b=10;
        int sum=a+b;
        System.out.println("Addition: "+sum);
    }
    public int sub(){
        int a=20;
        int b=10;
        int sub=a-b;
        return sub;
    }

    public static void main(String[] args) {
        MethodEX m = new MethodEX();
        m.add();
        System.out.println("Subtraction: "+m.sub());
    }
}
