package test.WARM_UP_TASKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class TASK_DROPDOWN2 {
    @Test
    public void dropdownVerification() {
        //TC #2: Selecting state from State dropdown and verifyingresult
        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // 2.Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
        // 3.Select Illinois
        Select select = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        select.selectByVisibleText("Illinois");
        select.selectByValue("IL");
        select.selectByIndex(14);
        // 4.Select Virginia
        select.selectByVisibleText("Virginia");
        select.selectByValue("VA");
        select.selectByIndex(47);
        // 5.Select California
        select.selectByVisibleText("California");
        select.selectByValue("CA");
        select.selectByIndex(5);
        // 6.Verify final selected option is California.Use all Select options.(visible text, value, index)

        if(select.getFirstSelectedOption().getText().equals("California")){
            System.out.println("Final selected option verification is PASSED");
        }else{
            System.out.println("Final selected option verification is FAILED!");
        }
        driver.close();
    }
}