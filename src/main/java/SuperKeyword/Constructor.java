package SuperKeyword;

class Bikes{
    Bikes(){
        System.out.println("Bikes are created");
    }
}
class TVS extends Bikes{
    TVS(){
        super();
        System.out.println("TVS is created");
    }
}

public class Constructor {
    public static void main(String[] args) {
        TVS t = new TVS();
    }
}
