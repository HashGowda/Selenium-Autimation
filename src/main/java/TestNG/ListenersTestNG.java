package TestNG;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class ListenersTestNG implements ISuiteListener {
    @Override
    public void onStart(ISuite suite){
        //beforesuite
        System.out.println("onStart-ISuite");
    }

    @Override
    public void onFinish(ISuite suite){
        //aftersuite
        System.out.println("onFinish-ISuite");
    }
}
