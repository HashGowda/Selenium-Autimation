package DecisionMaking;

public class Switch {
    public static void main(String[] args) {
        int m = 80;
        switch (m){
            case 60:
                System.out.println("FC");
                break;
            case 70:
                System.out.println("FCD");
                break;
            default:
                System.out.println("None of the above");
        }
    }
}
