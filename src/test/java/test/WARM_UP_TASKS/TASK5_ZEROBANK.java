package test.WARM_UP_TASKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class TASK5_ZEROBANK {
    @Test
    public void zerobankVerification(){
        //TC #5: Basic authentication Zero Bank
        // 1.Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        // 2.Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
        driver.manage().window().maximize();
        // 3.Enter username: username
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("username");

        // 4.Enter password: password
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
        // 5.Click sign in button
        WebElement singinButton=driver.findElement(By.xpath("//input[@type='submit']"));
        singinButton.click();
        // 6.Verify username is displayed on the page
        WebElement userName=driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
        if(userName.isDisplayed()){
            System.out.println("Username verification PASSED");
        }else{
            System.out.println("Username verification FAILED");
        }

        // 7.Verify the title Zero –Account Summary
        if (driver.getTitle().equals("Zero - Account Summary")) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }
        // 8.Verify the link Account Summary’s href value contains: “account-summary”
        if(driver.findElement(By.linkText("Account Summary")).getText().contains("Account Summary")){
            System.out.println("Value verification passsed");
        }else {
            System.out.println("Value verification failed");
        }
        // Print out results in validation formats


    }
}
