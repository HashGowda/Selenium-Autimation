package Encapsulation;

import org.checkerframework.checker.units.qual.A;

public class AccountTest {
    public static void main(String[] args) {
        Account ac = new Account();
        ac.setAcc_No(4567891344L);
        ac.setName("Account");
        ac.setEmail("Tesuser@gmail.com");
        ac.setAmount(522222);
        System.out.println("Acc_No="+ac.getAcc_No()+", Name="+ac.getName()+", Email="+ac.getEmail()+", Amount="+ac.getAmount());
    }
}
