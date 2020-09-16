package test.WARM_UP_TASKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class TASK_DROPDOWN5 {
    @Test
    public void dropdownVerification(){
        //#5: Selecting value from non-select dropdown
        // 1.Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        // 2.Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
        // 3.Click to non-select dropdown
        WebElement nonSelectDropdown=driver.findElement(By.id("dropdownMenuLink"));
        nonSelectDropdown.click();
        // 4.Select Facebook from dropdown
        WebElement facedropDown=driver.findElement(By.xpath("(//a[@class='dropdown-item'])[4]"));
         facedropDown.click();

        // 5.Verify title is “Facebook -Log In or Sign Up”
        String actualTitle = driver.getTitle();
        String expectedTitle = "Facebook - Log In or Sign Up";
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
