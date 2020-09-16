package test.WARM_UP_TASKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.SmartBearUtilities;
import utilities.WebDriverFactory;

import java.util.List;

public class TASK_SMARTBEAR1 {
    // #1: Smartbear software link verification
    // 1.Open browser
    // 2.Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
       driver.get(" http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
    @Test
    public void smartBearVerification() {

        // 3.Enter username: “Tester”
        // 4.Enter password: “test”
        // 5.Click to Login button
        SmartBearUtilities.login(driver);

        // 6.Print out count of all the links on landing page
        List<WebElement> allLinks =driver.findElements(By.xpath("//body//a"));
        // 7.Print out each link text on this
        for(WebElement each :allLinks){
            System.out.println(each.getText());
        }



    }
}
