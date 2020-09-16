package test.WARM_UP_TASKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.List;

public class TASK1_XPATH {
    @Test
    public void xpathVerification(){
        //TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
        // 1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        // 2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();
        // 3. Locate all the WebElements on the page using XPATH locator only (total of 6)

        // a. “Home” link
        WebElement homeLink=driver.findElement(By.xpath("//a[@class='nav-link']"));
        // b. “Forgot password” header
        WebElement forgotPasswordHeader= driver.findElement(By.xpath("//div[@class='example']/h2"));
        // c. “E-mail” text
        WebElement email=driver.findElement(By.xpath("//label[@for='email']"));
        // d. E-mail input box
        WebElement emailInput=driver.findElement(By.xpath("//input[@type='text']"));
        // e. “Retrieve password” button
        WebElement retrievePassword=driver.findElement(By.xpath("//button[@id='form_submit']/i"));
        // f. “Powered byCybertek School” text
        WebElement poweredCybertekText=driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        // 4. Verify all WebElements are displayed.
        if(homeLink.isDisplayed() && forgotPasswordHeader.isDisplayed() &&email.isDisplayed()
        && emailInput.isDisplayed() && retrievePassword.isDisplayed() &&poweredCybertekText.isDisplayed() ){
            System.out.println("All elements are DISPLAYED");
        }else{
            System.out.println("All elements are NOT DISPLAYED");
        }
        driver.close();
    }
}
