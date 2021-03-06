package test.day8_alerts_iframes_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowsTabsPractice {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/windows");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void p5_window_handle_practice(){

        String currentWindowHandle = driver.getWindowHandle();

        System.out.println("currentWindowHandle = " + currentWindowHandle);

        WebElement clickHereLink = driver.findElement(By.xpath("//a[.='Click Here']"));

        clickHereLink.click();
       //driver.getWindowHandles()returns us A SET of Strings
        Set<String> windowHandles=driver.getWindowHandles();
        for(String each :driver.getWindowHandles()){
          //  System.out.println("BEFORE SWITCHING");
            driver.switchTo().window(each);
           // System.out.println("AFTER SWITCHING");
            if(driver.getTitle().equals("New Window")) {
                System.out.println(driver.getTitle());
                Assert.assertTrue(driver.getTitle().equals("New Window"));
                break;
            }
        }



    }

}