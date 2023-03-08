package Framework1;

import org.testng.annotations.Test;

public class TestClass extends BaseClass {
    @Test
    public void login(){
        PageClass pg = new PageClass(driver);
        pg.login();
    }
}
