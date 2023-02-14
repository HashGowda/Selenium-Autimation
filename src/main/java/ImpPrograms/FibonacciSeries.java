package ImpPrograms;

class FibonacciSeries {
    public static void main(String[] args) {
        int n=10;
        fibonacciSeries(n);
    }

    public static void fibonacciSeries(int n){
        int n1=0,n2=1,n3;
        //System.out.println(n1+" "+n2);  //print 0 and 1
        for (int i=2;i<n;i++){          //loop starts from 2 because 0 and 1 are already printed
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}

