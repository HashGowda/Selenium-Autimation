package TestNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class LoginFailTest {
    @Test
    public void loginViaEmail(){
        System.out.println("Login via Email");
        try {
            Assert.assertEquals("Harish","Gowda");
        } catch (Throwable t){
            System.out.println(t);
        }
        System.out.println("After Assert Condition");

        //Assert.assertEquals(1,2);
        //Assert.assertTrue(4>1);
        //Assert.assertFalse(1<4);
    }
    @Test
    public void loginViaFacebook(){
        System.out.println("Login via Facebook");
    }
    @Test
    public void loginViaTwitter(){
        System.out.println("Login via Twitter");
    }
}
