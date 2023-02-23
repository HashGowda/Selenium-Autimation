package TestNG;

import org.testng.annotations.Test;

public class GroupsEx {
    @Test(groups = "Smoke")
    public void test1(){
        System.out.println("My Test Case1");
    }

    @Test(groups = "Sanity")
    public void test2(){
        System.out.println("My Test Case2");
    }

    @Test(groups = {"Smoke", "Sanity"})
    public void test3(){
        System.out.println("My Test Case3");
    }

    @Test(groups = "Regression")
    public void test4(){
        System.out.println("My Test Case4");
    }

    @Test(groups = "Sanity")
    public void test5(){
        System.out.println("My Test Case5");
    }

    @Test(groups = {"Smoke", "Sanity","Regression"})
    public void test6(){
        System.out.println("My Test Case6");
    }
}
