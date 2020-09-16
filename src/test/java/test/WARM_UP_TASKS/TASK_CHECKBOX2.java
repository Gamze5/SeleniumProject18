package test.WARM_UP_TASKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class TASK_CHECKBOX2 {
    @Test
    public void checkboxVerification(){
    //TC	#2:	SeleniumEasy	CheckboxVerification–Section	1
        // 1.Open	Chrome	browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        // 2.Go	to	https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        driver.manage().window().maximize();
        // 3.Verify	“Success	–Check	box	is	checked”	message	is	NOTdisplayed.
        WebElement successCheckbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
        WebElement successMessage =driver.findElement(By.xpath("//div[@id='txtAge']"));
        if(!successCheckbox.isSelected() && !successMessage.isDisplayed()){
            System.out.println("Verification is PASSED");
        }else{
            System.out.println("Verificartion is FAILED");
        }
        // 4.Click	to	checkbox	under	“Single	Checkbox	Demo”	section
        successCheckbox.click();
        // 5.Verify	“Success	–Check	box	is	checked”	message	isdisplayed
        if(successMessage.isDisplayed()){
            System.out.println("Success message is displayed.Verification PASSED");
        }else{
            System.out.println("Success message is not displayed.Verification FAILED");
        }
        driver.close();
    }
}
