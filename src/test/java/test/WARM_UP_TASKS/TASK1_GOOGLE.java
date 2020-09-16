package test.WARM_UP_TASKS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TASK1_GOOGLE {
    @Test
    public void testverification() {
        //TC   #1:    Google Title  Verification
        // 1.Open  Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //2.Go to https://www.google.com
        driver.get("https://www.google.com");
        //3. Verify title: Expected:  Google
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification passed");
        } else {
            System.out.println("Title verification failed");
        }
        driver.close();
    }
    }
