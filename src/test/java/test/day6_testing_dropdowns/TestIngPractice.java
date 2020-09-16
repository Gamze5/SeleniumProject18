package test.day6_testing_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestIngPractice {
    @BeforeClass
    public void before_class(){ //it runs one time
        System.out.println("Before class is running!");
    }
    @BeforeMethod
    public void setUp(){
        System.out.println(" Before method is running..");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("After method is running..");
    }
    @Test
    public void test1(){
        System.out.println("Test1 is running...");
        String actualTitle="Homepage";
        String expectedTitle="Homepage";
        Assert.assertEquals(actualTitle,expectedTitle);// testINGye ait asagidaki ifle yaptigimiz verificationi boyle
                                                       // de yapablrz.
       /* if(actualTitle.equals(expectedTitle)){
            System.out.println("title verification PASSED");
        }else{
            System.out.println("Title verification FAILED!!");
        }

        */
    }


    @Ignore// WE CAN USE THIS TO NOOT TO RUn the test but also you can remove @test as well with //
     @Test
    public void test2(){
        System.out.println("Test2 is running...");
       // Assert.assertEquals("string1","string2","String verification on test2 failed ");
    }


    @Test// bunu koymadan run yapamazsn
    public void test3(){
        System.out.println("Test3 is runnung ,,");
        String actualTitle="Amazon prime";
        String expectedInTitle="prime";
        String testString="shshsh";
         //Assert.assertTrue(false);// false cikar asagidaki teste devam etmez.

        System.out.println("GAMZE IS CHECKING AND RUNNING ALL TESTCASES");
        Assert.assertTrue(actualTitle.contains(expectedInTitle));//boolean value is true , it is gonna pass.
        Assert.assertFalse(actualTitle.contains(testString));//boolean value is false, it is gonna pass
    }


    @AfterClass
    public void after_class(){//one time executed.
        System.out.println("Afterclass is running!!");
    }
}

