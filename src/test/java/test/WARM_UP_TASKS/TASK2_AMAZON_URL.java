package test.WARM_UP_TASKS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TASK2_AMAZON_URL {
    @Test
    public void urlverification()throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // #2: Cybertek   verifications
        // 1.Open  Chrome browser
        // 2.Go    to https://practice.cybertekschool.com
        driver.get("https://amazon.com");
        Thread.sleep(2000);
        // 3.Verify    URL    containsExpected:  cybertekschool
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "zon";
        if (actualUrl.contains(expectedUrl)) {
            System.out.println("URL verification passed");
        } else {
            System.out.println("Url verification failed");
        }
        // 4.Verify    title: Expected:  Practice

    }

}
