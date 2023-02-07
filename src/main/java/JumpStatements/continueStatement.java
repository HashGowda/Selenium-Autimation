package JumpStatements;

public class continueStatement {

    public static void main(String[] args) {
//        for (int i=0; i<=2;i++){
//            for (int j=i;j<=5;j++){
//                if (j==4){
//                    continue;
//                }
//                System.out.println(j);
//            }
//        }
//    }
//}


        //Continue in while loop
        int i=0;
        while (i<10){
            if (i==4){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
