package test.WARM_UP_TASKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class TASK_CHECKBOX1 {
    @Test
    public void checkboxVerification()throws Exception{
      //  Practice:	Cybertek	Checkboxes
        //  1.Go	to	Practice:	Cybertek	Checkboxes1.http://practice.cybertekschool.com/checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");
        driver.manage().window().maximize();
        //  2.Confirm	checkbox	#1	is	NOT	selected	by	default
        WebElement checkBox= driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.isEnabled();
        if(!checkBox.isSelected()){
            System.out.println("Checkbox verification passed!");
        }else{
            System.out.println("Checkbox verification Failed!");
        }
        //  3.Confirm	checkbox	#2	is	SELECTED	by	default.
        WebElement checkBox2=driver.findElement(By.xpath("//input[@type='checkbox']/../input[2]"));
        checkBox2.isEnabled();
        if(checkBox2.isSelected()){
            System.out.println("Checkbox2 verification PASSED!");
        }else{
            System.out.println("Checkbox2 verification FAILED!!");
        }
        //  4.Click	checkbox	#1	to	select	it.
        checkBox.click();
        //  6.Confirm	checkbox	#1	is	SELECTED.
        Thread.sleep(4000);
        if(checkBox.isSelected()){
            System.out.println("Checkbox is SELECTED.verification PASSED");
        }else{
            System.out.println("Checkbox is NOT SELECTED.Verification FAILED");
        }

        //  5.Click	checkbox	#2	to	deselect	it.
        Thread.sleep(4000);
        checkBox2.click();

        //  7.Confirm	checkbox	#2	is	NOT
        if(!checkBox2.isSelected()){
            System.out.println("Checkbox2 is Not SELECTED.Verification PASSED");
        }else{
            System.out.println("Checkbox2 is SELECTED.Verification FAILED");
        }
      driver.close();
    }
}
