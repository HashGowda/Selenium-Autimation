package Constructors;

class CopyConstructor {

    //Copying values with constructor
    int id;
    String name;

    CopyConstructor(int i, String n){
        id=i;
        name=n;
    }

    CopyConstructor(CopyConstructor c){
        id=c.id;
        name=c.name;
        System.out.println("Copying values with constructor");
    }
    void display(){
        System.out.println(id+" "+name);
    }

    CopyConstructor(){
        System.out.println("Copying values without constructor");
    }
    void dis(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        CopyConstructor p = new CopyConstructor(12,"Boy");
        CopyConstructor p1 = new CopyConstructor(p);
        p.display();
        p1.display();
        CopyConstructor C = new CopyConstructor(13,"Girl");
        CopyConstructor C1 = new CopyConstructor();
        C1.id=C.id;
        C1.name=C.name;
        C.dis();
        C1.dis();
    }
}

//Copying values without constructor

