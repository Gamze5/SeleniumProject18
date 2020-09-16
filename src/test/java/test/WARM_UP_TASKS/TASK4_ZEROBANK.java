package test.WARM_UP_TASKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class TASK4_ZEROBANK {
    @Test
    public void zerobankVerification(){
        //TC #4: Zero Bank URLverification
        // 1.Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        // 2.Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
        driver.manage().window().maximize();
        // 3.Get attribute value of href from the “forgot your password”link
        String element= driver.findElement(By.linkText("Forgot your password ?")).getAttribute("href");
        // 4.Verify attribute value containsExpected: “/forgot-password.html
        String expectedValue="/forgot-password.html";
        if(element.contains(expectedValue)){
            System.out.println("Attribute value verficatiion passed");
        }else{
            System.out.println("Attribute verification failed");
        }
        driver.close();
    }
}
