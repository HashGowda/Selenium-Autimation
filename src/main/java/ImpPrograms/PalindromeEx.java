package ImpPrograms;

public class PalindromeEx {
    public static void main(String[] args) {
        palindrome();
        palindrome2();
    }

    static void palindrome(){
        String original="radar", reverse="";
        System.out.println("Original String: "+original);
        int n=original.length();
        for (int i=n-1;i>=0;i--) {
            reverse = reverse + original.charAt(i);
        }
            if (original.equals(reverse)) {
                System.out.println("Entered string/number is a palindrome");
            }
            else {
                System.out.println("Entered string/number is not a palindrome");
            }
        }

        static void palindrome2(){
        StringBuffer s1=new StringBuffer("1234");
        StringBuffer s2= new StringBuffer(s1);
        s2.reverse();
        if (String.valueOf(s1).equals(String.valueOf(s2))){
            System.out.println(s2+" is a palindrome");
        } else {
            System.out.println(s2+" is not a palindrome");
        }
        }
    }

