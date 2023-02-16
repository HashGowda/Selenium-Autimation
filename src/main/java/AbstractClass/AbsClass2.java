package AbstractClass;

//abstract class that has abstract and non-abstract method

abstract class Bikes{
    Bikes(){
        System.out.println("Bike is created");
    }
    abstract void run();
    void changeGear(){
        System.out.println("Gear changed");
    }
}
class Hondas extends Bikes{
    void run(){
        System.out.println("Running safely");
    }
}

class AbsClass2 {
    public static void main(String[] args) {
        Bikes b = new Hondas();
        b.run();
        b.changeGear();
    }
}
