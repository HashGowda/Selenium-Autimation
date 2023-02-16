package Interface;

interface add{
    void add();
}
interface sub{
    void sub();
}
interface mul extends add, sub{
    void mul();
}
class Addtion implements mul {
    public void add() {
        System.out.println("Add method");
    }

    public void sub() {
        System.out.println("Subtraction method");
    }

    public void mul() {
        System.out.println("Multiplication method");
    }

    public static void main(String[] args) {
        Addtion ad = new Addtion();
        ad.add();
        ad.sub();
        ad.mul();

        mul m = new Addtion();
        m.add();
        m.sub();
        m.mul();
    }
}
