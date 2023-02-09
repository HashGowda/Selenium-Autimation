package ArraysExamples;

public class ElementOccurrence {

    public static void main(String[] args) {
        int a[]={5,8,5,7,8,10};
        int size=a.length;
        countFrequency(a, size);
    }

    static void countFrequency(int a[], int size){
        for (int i=0; i<size;i++){
            int flag=0;
            int count=0;

            for (int j=i+1;j<size;j++){
                if (a[i]==a[j]){
                flag=1;
                break;
            }
        }

        if (flag==1)
            continue;

        for(int j=0;j<=i;j++){
            if (a[i]==a[j])
                count++;
        }
        System.out.println(a[i]+" occurs "+count+" times");
        }
    }
}

