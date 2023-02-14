package Constructors;

class ConstrOverLoading {
    int id, age; String name;

    ConstrOverLoading(int i, String n){
        id=i;
        name=n;
    }
    ConstrOverLoading(int i, String n, int a){
        id=i;
        name=n;
        age=a;
    }
    void display(){
        System.out.println(id+" "+name+" "+age);
    }

    public static void main(String[] args) {
        ConstrOverLoading c =new ConstrOverLoading(12,"Chetta",24);
        ConstrOverLoading c1 = new ConstrOverLoading(13, "Chechi", 22);
        c.display();
        c1.display();
    }
}
