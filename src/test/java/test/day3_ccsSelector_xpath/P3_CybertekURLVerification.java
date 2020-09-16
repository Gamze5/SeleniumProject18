package test.day3_ccsSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_CybertekURLVerification {
    public static void main(String[] args) {
        //TC #3: PracticeCybertek/ForgotPassword URL verification
        // 1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        // 2.Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        // 3.Enter any email into input box
        WebElement emailInput =driver.findElement(By.name("email"));
        emailInput.sendKeys("anyemail@email.com");
        // 4.Click on Retrieve password
        WebElement retrievePasswordButton=driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();
        // 5.Verify URL contains: Expected: “email_sent”
       String actualUrl= driver.getCurrentUrl();
       String expectedInUrl ="email_sent";
        System.out.println("The current URL "+actualUrl);
       if(actualUrl.contains(expectedInUrl)){
           System.out.println("URL verifictaion PASSED!!");
       }else{
           System.out.println("URL verification FAILED");
       }
        // 6.Verify textbox displayed the content as expected.Expected: “Your e-mail’s been sent!”
        WebElement confirmationMessage= driver.findElement(By.name("confirmation_message"));
       // eger yukaridakinin yanina getText gelirse String olur.
       String actualMessageText= confirmationMessage.getText();
       String expectedMessage="Your e-mail's been sent!";
        System.out.println("Actual message "+actualMessageText);

       if(actualMessageText.equals(expectedMessage)){
           System.out.println("Confirmation message text verification PASSED!");
       }else{
           System.out.println("Confirmation message text verification FAILED!");
       }

       if(confirmationMessage.isDisplayed()){// bu method webelement is displayed on the page or not
           System.out.println("Message is displayed, verification PASSED!");
       }else{
           System.out.println("Message is NOT displayed , verification FAILED!");
       }
    }
}
