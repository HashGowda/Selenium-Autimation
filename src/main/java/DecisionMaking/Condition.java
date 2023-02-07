package DecisionMaking;

public class Condition {

    public static void main(String[] args) {
//        int marks = 52;
//        if (marks >= 70 && marks <= 100) {
//            System.out.println("FCD");
//        } else if (marks<=60 && marks<70) {
//            System.out.println("FC");
//        } else if (marks>=50 && marks<60) {
//            System.out.println("SC");
//        }
//    }
//}

//        String city = "Delhi";
//        if (city=="Meerut"){
//            System.out.println("City is Meerut");
//        } else if (city=="Noida") {
//            System.out.println("City is Noida");
//        } else if (city=="Agra") {
//            System.out.println("City is Agra");
//        } else {
//            System.out.println("City is "+city);
//        }
//    }
//}

        String address = "Delhi, India";

        if (address.endsWith("India")) {
            if (address.contains("Noida")) {
                System.out.println("City is Meerut");
            } else if (address.contains("Noida")) {
                System.out.println("City is Noida");
            } else {
                System.out.println(address.split(",")[0]);
            }
        }else {
                System.out.println("You're not living in India");
            }
        }
    }
