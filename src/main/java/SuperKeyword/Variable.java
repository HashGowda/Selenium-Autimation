package SuperKeyword;

class Animal{
    String color = "White";
}
class Dog extends Animal{
    String color = "Black";
    void print(){
        System.out.println(color);   //print the color of the Dog class
        System.out.println(super.color);   //print the color of the Animal class
    }
}

public class Variable {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.print();
    }
}
