package ArraysExamples;

public class RemoveDuplicateElements {
    public static int removeDuplicateElements(int a[], int n){
        if (n==0 || n==1){
            return n;
        }
        int temp[]= new int[n];
        int j=0;
        for (int i=0;i<n-1;i++){
            if (a[i]!=a[i+1]){
                temp[j++]=a[i];
            }
        }
        temp[j++]=a[n-1];

        //Changing original array
        for (int i=0;i<j;i++){
            a[i]=temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        int a[]={10,20,20,30,30,40,50,50};
        int l = a.length;
        l=removeDuplicateElements(a, l);
        for (int i=0; i<l;i++){
            System.out.println(a[i]+" ");
        }
    }
}
