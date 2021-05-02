package test.day5_testing_intro;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FirstTestNGClass {
    @BeforeMethod
    public void setup(){
        System.out.println("Before method running...");
    }

    @AfterMethod      // it doesnt matter anywhere u can put  it is also samefor beforemethod
    public void tearDown(){
        System.out.println("After method running...");
    }
    @Test(groups={"gurhan test"})
    public void test1(){
        System.out.println("Test1 is running...");
    }


    @Test(invocationCount = 5)//repeating the test
    public void test2(){
        System.out.println("Test2 is running...");
    }


}
