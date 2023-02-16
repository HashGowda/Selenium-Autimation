package Interface;

interface Shape{
    void draw();
}
class Rectangle implements Shape{
    public void draw(){
        System.out.println("Drawing rectangle");
    }
}
class Circle implements Shape{
    public void draw(){
        System.out.println("Drawing circle");
    }
}

public class Interface2 {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
        Shape s1 = new Rectangle();
        s1.draw();
    }
}
