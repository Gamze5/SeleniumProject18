package test.day6_testing_dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class TestNGSeleniumPractice {
    WebDriver driver;//bunu boyle baslatirsak

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");// basina normalde WebDriver koyuyorduk ama yukarda baslattgmz icin koymayiz
        driver.get("https://www.google.com");
    }

    @AfterMethod
   public void tearDown() throws InterruptedException{
        Thread.sleep(2000);
        driver.close();
   }

    @Test
    public void google_title_test(){
      //1.go to:https://www.google.com

        //2.Verify title: Google
        String expectedTitle="Google";
        String actualTitle=driver.getTitle();
        Assert.assertTrue(actualTitle.equals(expectedTitle));// eger bunu kullalnirsan icine boolean methhod koyman gerekiyoe.
        Assert.assertEquals(actualTitle,expectedTitle);// bunda direkt compare edeceklerini yaziyorsun
    }


     @Test(priority = 1)//eger boyle yazarsam ilk bu test yurutulur.
    public void google_search_title_verification(){
        //1- open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com");

        //2- go to https://google.com
        String expectedTitle="Google";
        String actualTitle=driver.getTitle();


       //3- search "apple"
        //locating the google search box
        WebElement appleSearchBox =driver.findElement(By.name("q"));
        //sending apple string into search box and pressing enter
        appleSearchBox.sendKeys("apple"+ Keys.ENTER);


       //4- verify title contains "apple"
        String expectedInTitle="apple";
        String actualInTitle=driver.getTitle();
        Assert.assertTrue(actualInTitle.contains(expectedInTitle));


       //5- close browser
        driver.close();

    }
}
