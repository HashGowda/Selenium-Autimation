package Constructors;

public class StudentC {

    //To invoke current class constructor
    //calling default constructor from parameterized constructor
    StudentC(){
        int age=21;
        String name="VK";
        System.out.println("Age: "+age+", "+"Name: "+name);
    }

    StudentC(String city){
        this();
        System.out.println("City: "+city);
    }

    public static void main(String[] args) {
        StudentC s =new StudentC("Mysore");
    }
}
