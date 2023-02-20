package ImpPrograms;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 2 to 10");
        for (int i=2;i<=10;i++){
            int check=0;
            for (int j=2;j<i;j++){
                if (i%j==0){
                    check++;
                    break;
                }
            }
            if (check==0){
                System.out.println(i);
            }
        }
    }
}
