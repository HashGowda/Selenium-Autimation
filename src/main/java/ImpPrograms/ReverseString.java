package ImpPrograms;

public class ReverseString {

    public static void main(String[] args) {
        ReverseString r = new ReverseString();
        r.reverse();
        r.reverseByChar();
    }
    void reverse() {
        String s = "Naveen";
        String s1 = "";
        int n=s.length();
        for (int i=n-1;i>=0;i--){
            s1=s1+s.charAt(i);
        }
        System.out.println("Reversed string = "+s1);
    }

    void reverseByChar(){
        String s="Pradeep";
        char c[]=s.toCharArray();
        for (int i=c.length-1;i>=0;i--){
            System.out.print(c[i]);
        }
    }
}
