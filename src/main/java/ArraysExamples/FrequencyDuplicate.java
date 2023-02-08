package ArraysExamples;

import java.util.Arrays;

public class FrequencyDuplicate {

    public static void main(String[] args) {
        int a[]={2, 3, 5, 4, 3, 1, 3, 2, 1};
        Arrays.sort(a);
        int i,j,frequency;
        System.out.println("These elements are repeated along with its frequency");
        for (i=0;i<a.length;i++){
            frequency=1;
            for (j=i+1; j<a.length;j++){
                if (a[j]==a[i]){
                    frequency++;
                } else {
                    break;
                }
            }
            i=j-1;
            if (frequency>1){
                System.out.println(a[i]+"---->"+frequency);
            }
        }
    }
}
