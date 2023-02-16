package StaticComponents;

public class StaticCom {
    int age=21;
    static String name="Java";

    static void displayName(){
        name="Python";
        System.out.println(name);
    }
    void displayAge(){
        System.out.println(age);
    }

    public static void main(String[] args) {
        StaticCom s = new StaticCom();
        s.displayName();
        s.displayAge();
        StaticCom.displayName();     //classname.methodname
        System.out.println("Name from main: "+name);

    }
    static {
        String city="Mysore";
        System.out.println(city);
        System.out.println("Name from static block: "+name);
    }
}
