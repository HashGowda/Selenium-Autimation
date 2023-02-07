package Loops;

public class forLoop {

    public static void main(String[] args) {

        //for each loop
//        int[] numbers = {10, 20, 30, 40, 50};
//        for (int x:numbers){
//            System.out.print(x);
//            System.out.print(", ");
//        }
//
//        System.out.println("\n");
//        String names[]={"James", "Larry", "Tom", "Lacy"};
//        for (String y:names){
//            System.out.print(y);
//            System.out.print(", ");
//        }
//    }
//}

//        String lang[] = {"Java", "C", "C++", "Python", "JavaScript"};
//        System.out.println("Printing content of the array lang:\n");
//        for (String list : lang) {
//            System.out.println(list);
//        }
//    }
//}

        //for loop
//        int sum = 0;
//        for (int i = 0; i <= 10; i++) {
//            sum += i;
//        }
//            System.out.println("Sum: " + sum);
//        }
//    }

        //print even numbers
//        System.out.println("Printing the even numbers:\n");
//        for (int i = 0; i <= 10; i = i + 2) {
//            System.out.println(i);
//        }
//    }
//    }

        //Nested for loop
        //Outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer loop: " + i);

            //Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner loop: " + j);
            }
        }
    }
}

