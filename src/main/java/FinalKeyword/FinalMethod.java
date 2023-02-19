package FinalKeyword;

class Bike{
    final void run(){
        System.out.println("Bike is created");
    }
}
class Hero extends Bike{

}

public class FinalMethod {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.run();
    }
}
