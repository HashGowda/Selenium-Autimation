package Framework2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPageAction implements ConstantDetails {
    WebDriver driver;
    GenericFunctions generic;
    LoginPageObjects loginPageObjects = new LoginPageObjects();

    public LoginPageAction(){
        this.driver= DriverManager.getDriver();
        generic = new GenericFunctions(driver);

        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, loginPageObjects);
    }

    public void validLogin() throws InterruptedException {
        generic.sendKeys(loginPageObjects.userName, userName, "Username");
        Reporter.log("Username is entered");
        generic.sendKeys(loginPageObjects.password, password,"Password");
        Reporter.log("Password is entered");
        generic.waitAndClick(loginPageObjects.loginBtn,"Login Button");
        Reporter.log("Login Button is clicked");
    }

    public void invalidLogin() throws InterruptedException {
        generic.sendKeys(loginPageObjects.userName, userName,"Username");
        generic.sendKeys(loginPageObjects.password, invalidPassword,"Password");
        generic.waitAndClick(loginPageObjects.loginBtn,"Login Button");
        Reporter.log("Entered incorrect credentials");
        generic.isElementPresentAssertTrue(loginPageObjects.viewMyDetails);
    }
}
