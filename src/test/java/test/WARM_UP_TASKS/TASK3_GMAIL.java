package test.WARM_UP_TASKS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class TASK3_GMAIL {

    //TC #3: Back and forth navigation
    // 1-Open a chrome browser
    @Test
    public void googleverification() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        // 2-Go to: https://google.com
        driver.get("https://google.com");
        // 3-Click to Gmail from top right.
        WebElement gmail=driver.findElement(By.xpath("//a[@class='gb_g']"));
        gmail.click();
        // 4-Verify title contains:Expected: Gmail
        String actualResult= driver.getTitle();
        String expectedResult="Gmail";
        if(actualResult.contains(expectedResult)){
            System.out.println("Verification passed");
        }else{
            System.out.println("Verification is failed");
        }

        // 5-Go back to Google by using the .back();
        driver.navigate().back();
        // 6-Verify title equals:Expected: Google
        String actualTitle=driver.getTitle();
        String expectedTitle="Google";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification passed");
        }else{
            System.out.println("Title verification failed");
        }
        driver.close();
    }
}