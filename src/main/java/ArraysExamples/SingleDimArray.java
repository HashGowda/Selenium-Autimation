package ArraysExamples;

public class SingleDimArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]= new int[4];
        b[0]=10;
        b[1]=20;
        b[2]=30;
        b[3]=40;

        for (int i=0; i<a.length;i++){
            System.out.println(a[i]);
        }

        System.out.println("\n");
        for (int i=0; i<b.length;i++){
            System.out.println(b[i]);
        }

        System.out.println("\n");
        for (int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }

        System.out.println("\n");
        for (int i=b.length-1;i>=0;i--){
            System.out.println(b[i]);
        }

        System.out.println("\n");
        String s[]={"A","B","C","D","E"};
        for (int i=0;i<s.length;i++){
            System.out.println(s[i]+" ");
        }

        System.out.println("\n");
        char c[]={'a','b','c','d'};
        int i=0;
        while (i<c.length){
            System.out.println(c[i]);
            i++;
        }

        System.out.println("\n");
        String s1[]={"Java","manual","Selenium","Appium"};
        for (String s2:s1){
            System.out.println(s2);
        }

        System.out.println("\n");
        for (int k=0;k< s1.length;k++){
            System.out.println(s1[k]);
        }

        System.out.println("\n");
        int i1[]={1,2,3,4};
        for (int k=0;k< i1.length;k++){
            System.out.println(i1[k]);
        }

        System.out.println("\n");
        for (int d:i1){
            System.out.println(d);
        }
    }
}
