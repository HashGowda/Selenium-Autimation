package Constructors;

public class StudentConst {
    int age;
    String name, city, college;

    StudentConst(String name, int age, String city, String collName){
        this.age=age;
        this.name=name;
        this.city=city;
        college=collName;
        System.out.println("Age: "+this.age);
        System.out.println("College Name: "+college);
    }
    void showResults(){
        System.out.println("Name: "+name+", City: "+city);
    }

    public static void main(String[] args) {
        StudentConst s =new StudentConst("VK", 34, "Delhi","BMSE");
        s.showResults();
        StudentConst s1 = new StudentConst("AS", 32, "Mumbai","RVCE");
        s1.showResults();
    }
}
