package JumpStatements;

public class breakStatement {
    public static void main(String[] args) {
//        for (int i=0; i<=10; i++){
//            if (i==5){
//                break;
//            }
//            System.out.println(i);
//        }
//    }
//}


        //Break in while loop
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }
    }
}
