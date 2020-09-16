package test.day2_findElement_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ASSIGNMENT {
    public static void main(String[] args) {


        // TC #2: Zero Bankheader verification
        // 1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        // 2.Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
        // 3.Verify header textExpected: “Log in to ZeroBank”
        String actualHeader2 = driver.findElement(By.tagName("h3")).getText();
        String expectedHeader = "Log in to ZeroBank";
        if(actualHeader2.equals(expectedHeader)){
            System.out.println("Header verification is PASSED!");
        } else {
            System.out.println("Headet verification is FAILED!");
        }

    }
}