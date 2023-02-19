package FinalKeyword;

class College {
    final int age=21;
    void add(){
        int a=12;
        int b=20;
        System.out.println(a+b);
    }
}
class Campus extends College{
    void add(){
        final String name="Kiran";
        int a=29;
        int b=19;
        System.out.println("Addition = "+a+b);
        System.out.println("Name = "+name);
    }
}

public class FinalVariable {
    public static void main(String[] args) {
        Campus c = new Campus();
        c.add();
    }
}

