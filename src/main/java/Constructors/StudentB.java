package Constructors;

public class StudentB {

    //To invoke the current class constructor
    //Calling parameterized constructor from default constructor
    StudentB(){
        this("Mysuru");
        int age=21;
        String name="VK";
        System.out.println("Age: "+age+", "+"Name: "+name);
    }
    StudentB(String city){
        System.out.println("City: "+city);
    }

    public static void main(String[] args) {
        StudentB s = new StudentB();
    }
}
