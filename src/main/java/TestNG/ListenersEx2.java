package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenersEx2 {

    @Test
    public void loginWithEmail(){
        System.out.println("Inside test login with email");
    }

    @Test
    public void loginWithFacebook(){
        System.out.println("Inside test login with Facebook");
        Assert.assertEquals("Test1","Test2");
    }
}
