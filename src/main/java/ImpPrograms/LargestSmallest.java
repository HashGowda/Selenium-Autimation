package ImpPrograms;

public class LargestSmallest {
    public static void main(String[] args) {
        largest();
        smallest();
    }

    static void largest(){
        int a[]={10,30,10,20,40,50};
        int largest=a[0];
        for (int i=1;i<a.length;i++){
            if (a[i]>largest){
                largest=a[i];
            }
        }
        System.out.println("Largest number : "+largest);
    }

    static void smallest(){
        int a[]={2,4,7,2,1,9,0};
        int smallest=a[0];
        for (int i=0;i<a.length;i++){
            if (a[i]<smallest){
                smallest=a[i];
            }
        }
        System.out.println("Smallest number : "+smallest);
    }
}
