package ImpPrograms;

class SwapInt {
    public static void main(String[] args) {
        int a=5,b=10,c;
        System.out.println("Before swap: "+a+" "+b);
        c=a+b;
        b=c-b;
        a=a+b;
        System.out.println("After swap: "+a+" "+b);
    }
}
