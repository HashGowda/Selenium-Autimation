package Tests;

import Framework2.BaseClass;
import Framework2.LoginPageAction;
import org.testng.annotations.Test;

public class InValidLoginTest extends BaseClass {
    public LoginPageAction getLoginPage(){
        return  new LoginPageAction();
    }

    @Test
    public void InValidLogin() throws InterruptedException {
        getLoginPage().invalidLogin();
    }
}
