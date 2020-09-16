package test.WARM_UP_TASKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class TASK_DROPDOWN1 {
    @Test
    public void dropdownVerification(){
        //TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // 2.Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
        // 3.Verify “Simple dropdown” default selected value is correctExpected: “Please select an option”
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
       String actualText=simpleDropdown.getFirstSelectedOption().getText();
        String expectedText="Please select an option";
        Assert.assertEquals(actualText,expectedText);


        // 4.Verify“State selection” default selected value is correctExpected: “Select a State”
        Select stateSelection =new Select(driver.findElement(By.xpath("//select[@id='state']")));
        String stateSelectionText=stateSelection.getFirstSelectedOption().getText();
        String expectedStateText ="Select a State";
        Assert.assertEquals(stateSelectionText,expectedStateText);
        driver.close();
    }
}
