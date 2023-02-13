package StringExamples;

public class ReverseString {

    public static void main(String[] args) {
        String in = "This is a string, which needs to be tested";
        reverseString(in);
        String ip = "Hello";
        revString(ip);
    }

    public static void reverseString(String in){
        String out = " ";
        for (int i=in.length()-1;i>=0;i--){
            out+=in.charAt(i);
        }
        System.out.println("Reversed string: "+out);
    }

    public static void revString(String ip){
        String oup=" ";
        for (int i=0;i<ip.length();i++){
            oup=ip.charAt(i)+oup;
        }
        System.out.println("Rev String: "+oup);
    }
}
