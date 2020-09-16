package test.WARM_UP_TASKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class TASK_CHECKBOX4 {
    @Test
    public void checkboxVerification(){
        //1. Open Chrome browser
        // 2. Go to http://practice.cybertekschool.com/add_remove_elements
        // 1. Open Chrome browser
        // 2. Go to http://practice.cybertekschool.com/add_remove_elements
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
        // 3. Click to "Add Element" button
        driver.findElement(By.xpath("//div/div/button")).click();
        // 4. Verify "Delete" button is displayed after clicking.
        WebElement deleteButton= driver.findElement(By.xpath("//div/div/button[@class='added-manually']"));
        if (deleteButton.isDisplayed()){
            System.out.println("Delete is displayed");
        }else{
            System.out.println("Delete is not displayed");}
        // 5. Click to "Delete" button.
        deleteButton.click();
        // 6. Verify "Delete" button is NOT displayed after clicking.
        if (driver.findElement(By.xpath("//div/div/div[@id='elements']")).isDisplayed()){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");}
    }
}
