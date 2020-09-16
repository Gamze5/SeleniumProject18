package test.WARM_UP_TASKS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TASK4_APPLE {
    public static void main(String[] args) {
        //TC#4:    Google search
        // 1-Open  a  chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // 2-Go    to:    https://google.com
        driver.get("https://google.com");
        // 3-Write "apple"    in search box
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("apple");
        // 4-Click google search button
        WebElement element=driver.findElement(By.xpath("(//input[@class='gNO89b'])"));
        element.click();
        // 5-Verify    title:Expected:    Title  should start  with   "apple
        String actualTitle = driver.getTitle();
        String expecedTitle = "apple";
        if (actualTitle.startsWith(expecedTitle)) {
            System.out.println("Title verification passed");
        } else {
            System.out.println("Title verification failed");
        }

    }
}
