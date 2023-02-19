package SuperKeyword;

class Animals{
    void eat(){
        System.out.println("Eating...");
    }
}
class Dogs extends Animals{
    void eat(){
        System.out.println("Eating bread...");
    }
    void bark(){
        System.out.println("Barking...");
    }
    void work(){
        super.eat();   //To call the method present in Parent class
        bark();
    }
}

public class Method {
    public static void main(String[] args) {
        Dogs d = new Dogs();
        d.work();
        d.eat();    //To call the method present in the subclass
    }
}
