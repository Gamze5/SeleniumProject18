package test.WARM_UP_TASKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.List;

public class TASK_CHECKBOX3 {
    @Test
    public void checkboxVerification()throws Exception {
        //C	#3:	SeleniumEasy	Checkbox	Verification	–Section	21
        // .Open	Chrome	browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        // 2.Go	to	https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        driver.manage().window().maximize();
        String getTextCheckAll = driver.findElement(By.xpath("//input[@type='button']")).getAttribute("value");
        if (getTextCheckAll.equals("Check All")) {
            System.out.println("Check All button verified. Passed!");
        } else {
            System.out.println("Check All button is not verified. Failed!");
        }
        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
        List<WebElement> checkBox=driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for (WebElement each:checkBox) {
            if (each.isSelected()) {
                System.out.println("All check boxes are checked.Passed");
            } else {
                System.out.println("All check boxes are not checked.Failed");
            }
        }
        String uncheckAllText=driver.findElement(By.xpath("//input[@value='Uncheck All']")).getAttribute("value");
        if(uncheckAllText.equals("Uncheck All")){
            System.out.println("Unchecked All button verified .Passed");
        }else{
            System.out.println("Unchecked All button is not verified .Failed");
        }
    }
}
