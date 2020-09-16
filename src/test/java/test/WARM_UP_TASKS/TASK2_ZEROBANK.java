package test.WARM_UP_TASKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class TASK2_ZEROBANK {
    @Test
    public void zerobankVerification(){
        // #2: Zero Bankheader verification
        // 1.Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        // 2.Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
        driver.manage().window().maximize();
        // 3.Verify header textExpected: “Log in to ZeroBank
       String element=driver.findElement(By.tagName("h3")).getText();
        String expectedHeader="Log in to ZeroBank";
        if(element.equals(expectedHeader)){
            System.out.println("Header verification passed!");
        }else{
            System.out.println("Header verification failed");
        }
        driver.close();

    }
}
