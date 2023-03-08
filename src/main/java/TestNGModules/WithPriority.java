package TestNGModules;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class WithPriority {
    @Test(priority = 1)
    public void signIn(){
        throw new SkipException("Skip until we get more Usernames and Passwords");
    }

    @Test(priority = 2, dependsOnMethods = {"signIn"})
    public void registration(){
        System.out.println("Register a user");
    }

    @Test(priority = 3)
    public void signOut(){
        System.out.println("Signing out of the application \n");
    }
}
