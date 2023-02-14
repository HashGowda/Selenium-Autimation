package Constructors;

public class DefParamConst {

    DefParamConst(){
        String name="KK";
        String city="Mysuru";
        System.out.println("Name: "+name);
        System.out.println("City: "+city);
    }
    DefParamConst(String name, String city, int age){
        System.out.println("Name: "+name);
        System.out.println("City: "+city);
        System.out.println("Age: "+age);
    }
    DefParamConst(String branch){
        System.out.println("Branch: "+branch);
    }
    void display(){
        int age=22;
        System.out.println("Age: "+age);
    }
    void addition(int a, int b){
        int sum=a+b;
        System.out.println("Sum: "+sum);
    }
    void login(String userName, String password){

    }

    public static void main(String[] args) {
        DefParamConst d = new DefParamConst();
        DefParamConst d1 = new DefParamConst("Mechanical");
        d.display();
        d.addition(10,10);
        d.addition(2,5);
        d.addition(5,7);

        DefParamConst d2 = new DefParamConst("PP", "Bengaluru", 19);
    }
}
