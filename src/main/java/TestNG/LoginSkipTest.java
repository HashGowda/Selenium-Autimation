package TestNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class LoginSkipTest {
    @Test
    public void loginViaEmail(){
        System.out.println("Login via Email");
    }
    @Test
    public void loginViaFacebook(){
        System.out.println("Login via Facebook");
        throw new SkipException("Facebook functionality is supported");
    }
    @Test
    public void loginViaTwitter(){
        System.out.println("Login via Twitter");
    }
}
