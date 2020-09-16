package test.WARM_UP_TASKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.List;

public class TASK_DROPDOWN4 {
    @Test
    public void dropdownVerification() {

        //TC #4: Selecting value from multiple select dropdown
        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // 2.Go to http://practice.cybertekschool.com/dropdown
       driver.get("http://practice.cybertekschool.com/dropdown");
       driver.manage().window().maximize();
        // 3.Select all the options from multiple select dropdown.
        Select select =new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        // 4.Print out all selected values.
        List<WebElement> allselection=select.getOptions();
        for(WebElement each : allselection){
            System.out.println( each.getText());
        }
        // 5.Deselect all values
        select.deselectAll();
    }
}
