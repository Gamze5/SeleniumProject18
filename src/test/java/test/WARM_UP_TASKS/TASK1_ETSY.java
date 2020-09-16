package test.WARM_UP_TASKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class TASK1_ETSY {
    @Test
    public void etsyverification(){
      //  TC #1: EtsyTitle Verification
        //  1.Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //  2.Go to https://www.etsy.com
        driver.get("https://www.etsy.com");
        driver.manage().window().maximize();
        //  3.Search for “wooden spoon”
     WebElement element= driver.findElement(By.id("global-enhancements-search-query"));
       element.sendKeys("wooden spoon");
     WebElement element2= driver.findElement(By.xpath("//span[@class='etsy-icon wt-nudge-b-1']"));
      element2.click();

        //  4.Verify title: Expected: “Wooden spoon | Etsy”
        String actualTitle=driver.getTitle();
        String expectedTitle="Wooden spoon | Etsy";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Etsy title verification passed");
        }else{
            System.out.println("Etsy title verification failed");
        }
        driver.close();
    }
}
