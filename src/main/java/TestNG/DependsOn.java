package TestNG;

import org.testng.annotations.Test;

public class DependsOn {

    @Test(dependsOnMethods = "registration")
    void login(){
        System.out.println("Login");
    }
    @Test
    void registration(){
        System.out.println("registration");
    }
    @Test(dependsOnMethods = "login")
    void logout(){
        System.out.println("Logout");
    }
}
