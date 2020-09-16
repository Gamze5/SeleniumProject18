package test.WARM_UP_TASKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class TASK_DROPDOWN3 {
    @Test
    public void dropdownverifaction(){
        //TC #3: Selecting date on dropdown and verifying
        // 1.Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        // 2.Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
        // 3.Select “December 1st, 1921” and verify it is selected.
        Select selectYear =new Select(driver.findElement(By.xpath("//select[@id='year']")));
        selectYear.selectByVisibleText("1921");
        Select selectMonth=new Select(driver.findElement(By.xpath("//select[@id='month']")));
        selectMonth.selectByValue("11");
        Select selectDay=new Select(driver.findElement(By.xpath("//select[@id='day']")));
        selectDay.selectByIndex(0);
        // Select year using: visible textSelect month using : value attributeSelect day using: index number
        driver.close();
    }
}
