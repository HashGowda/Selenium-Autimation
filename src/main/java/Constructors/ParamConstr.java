package Constructors;

class ParamConstr {

    int id;
    String name;

    ParamConstr(int i, String n){
        id =i;
        name=n;
    }

    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        ParamConstr p = new ParamConstr(12, "Cheek");
        ParamConstr p1 = new ParamConstr(14, "Geek");
        p.display();
        p1.display();
    }
}
