package test.WARM_UP_TASKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class TASK3_ZEROBANK {
    @Test
    public void zerobankVerification(){
        //TC #3: PracticeCybertek/ForgotPassword URL verification
        // 1.Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        // 2.Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();
        // 3.Enter any email into input box
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("gamzedelikanli@outlook.com");
        // 4.Click on Retrieve password
        WebElement retrieveButton=driver.findElement(By.xpath("//button[@id='form_submit']/i"));
        retrieveButton.click();
        // 5.Verify URL contains: Expected: “email_sent”
        String actualURL=driver.getCurrentUrl();
        String expectedURL="email_sent";
        if(actualURL.contains(expectedURL)){
            System.out.println("URL verification passsed");
        }else{
            System.out.println("URL verifiacation failed");
        }
        // 6.Verify textbox displayed the content as expected.Expected: “Your e-mail’s been sent!”
        WebElement text= driver.findElement(By.xpath("//h4[@name='confirmation_message']"));
        if(text.isDisplayed()){
            System.out.println("Textbox is DISPLAYED");
        }else{
            System.out.println("Textbox is NOT DISPLAYED");
        }
        driver.close();
    }
}
