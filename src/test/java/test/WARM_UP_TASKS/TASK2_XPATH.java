package test.WARM_UP_TASKS;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class TASK2_XPATH {
    @Test
    public void deleteButtonVerificaton() {
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        // 2. Go to http://practice.cybertekschool.com/add_remove_elements
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
        driver.manage().window().maximize();
        // 3. Click to “Add Element” button
        WebElement addElementButton=driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addElementButton.click();
        // 4. Verify “Delete” button is displayed after clicking.
        WebElement deleteButton =driver.findElement(By.xpath("//button[@class='added-manually']"));
        if(deleteButton.isDisplayed()){
            System.out.println("Delete button is DISPLAYED");
        }else{
            System.out.println("Delete button is NOT DISPLAYED");
        }
        // 5. Click to “Delete” button.
        deleteButton.click();
        // 6. Verify “Delete” button is NOT displayed after clicking
        try {
            if (!deleteButton.isDisplayed()) {
                System.out.println("Delete button is deleted. verification is passed");
            } else {
                System.out.println("Delete button is not deleted. Verification is failed");
            }
        }catch(StaleElementReferenceException exception){
            System.out.println("StaleElements exception is thrown");
            System.out.println("It means element has been deleted from completely from HTML");
            System.out.println("Dlete button is not displayed.Verification is passed");
            }

    }
}