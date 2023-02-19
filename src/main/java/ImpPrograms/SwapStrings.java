package ImpPrograms;

public class SwapStrings {
    public static void main(String[] args) {

        //using temporary variable

        String str1="Hello";
        String str2="World!";

        System.out.println("Before swapping:");
        System.out.println("String 1 : "+str1);
        System.out.println("String 2 : "+str2);

        String temp=str1;
        str1=str2;
        str2=temp;

        System.out.println("\nAfter swapping:");
        System.out.println("String 1 : "+str1);
        System.out.println("String 2 : "+str2);

        //using the concat method
    }
}
