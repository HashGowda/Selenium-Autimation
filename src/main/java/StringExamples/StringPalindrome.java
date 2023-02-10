package StringExamples;

public class StringPalindrome {

    public static void stringPalindrome(String a) {
        String b = "";
        int n = a.length();
        for (int i = n - 1; i >= 0; i--) {
            b = b + a.charAt(i);
        }

            if (a.equals(b)) {
                System.out.println(a + " is a palindrome");
            } else {
                System.out.println(a + " is not a palindrome");
            }
        }


    public static void main(String[] args) {
        String a = "RADAR";
        stringPalindrome(a);
    }
}


//    public static void main(String[] args) {
//        String str = "RADAR", revStr = "";
//        int a = str.length();
//        for (int i=a-1;i>=0;--i){
//            revStr = revStr+str.charAt(i);
//        }
//        if (str.equals(revStr)){
//            System.out.println(str+" is a palindrome");
//        }
//        else {
//            System.out.println(str+" is not a palindrome");
//        }
//    }
//}


//    public static void main(String[] args) {
//        String in = "madam";
//        String rev = reverseString(in);
//        if (in.equals(rev)){
//            System.out.println("its a palindrome");
//        } else {
//            System.out.println("Its not a palindrome");
//        }
//    }
//
//    public static String reverseString(String in){
//        String reverseString = "";
//
//        for (int i=in.length()-1;i>=0;i--){
//            reverseString+=in.charAt(i);
//        }
//        return reverseString;
//    }
//}