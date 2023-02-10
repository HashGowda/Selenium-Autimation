package StringExamples;

import org.bouncycastle.crypto.agreement.srp.SRP6Client;

public class CompareStrings {

    static void compareStrings(String a, String b){
        if (a.equals(b)){
            System.out.println("Both strings are equal");
        } else {
            System.out.println("Both strings are not equal");
        }

        if (a.equalsIgnoreCase(b)){
            System.out.println("Both strings are equal");
        } else {
            System.out.println("Both strings are not equal");
        }
    }

    public static void main(String[] args) {
        String a= "AVATAR";
        String b= "avatar";
        compareStrings(a,b);
    }
}
