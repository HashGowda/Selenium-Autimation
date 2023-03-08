package Tests;

import Framework2.BaseClass;
import Framework2.LoginPageAction;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {
    public LoginPageAction getLoginPage(){
        return new LoginPageAction();
    }

    @Test
    public void TC_01_Login() throws InterruptedException {
        getLoginPage().validLogin();
    }

    @Test
    public void TC_02_InValidLogin() throws InterruptedException {
        getLoginPage().invalidLogin();
    }
}
