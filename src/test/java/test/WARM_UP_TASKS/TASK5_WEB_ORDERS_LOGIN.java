package test.WARM_UP_TASKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class TASK5_WEB_ORDERS_LOGIN {

    @Test
    public void smartbearTest() {
        //TC#5:	Basic	login	authentication
        // 1-Open	a	chrome	browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        // 2-Go	to:	http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.manage().window().maximize();
        // 3-Verify	title	equals:    Expected:	Web	Orders	Login
        String actualTitle=driver.getTitle();
        String expectedTitle="Web Orders Login";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is passed!");
        }else{
            System.out.println("Title verification is failed");
        }
        // 4-Enter	username:	Tester
    driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']")).sendKeys("Tester");

        // 5-Enter	password:	test
       driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']")) .sendKeys("test");
        // 6-Click	“Sign	In”	button
       WebElement submitButton= driver.findElement(By.xpath("//input[@type='submit']"));
       submitButton.click();
        // 7-Verify	titleequals:Expected:	Web	Orders
        String actualTitleofClickedPage= driver.getTitle();
        String expectedTitleClickedPage="Web Orders";
        if(actualTitleofClickedPage.equals(expectedTitleClickedPage)){
            System.out.println("Title verification passed");
        }else{
            System.out.println("Title verification failed");
        }

        driver.close();
    }
}