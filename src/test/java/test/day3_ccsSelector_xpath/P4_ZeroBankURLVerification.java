package test.day3_ccsSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_ZeroBankURLVerification {
    public static void main(String[] args) {
      //  TC #4: Zero Bank URLverification
        //  1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        //  2.Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");


        //  3.Get attribute value of href from the “forgot your password”link
        // driver.findElement(By.linkText("Forgot your password ?"))
         driver.findElement(By.partialLinkText("Forgot"));//ustte ki de ollur iki yolu var.
        WebElement forgotPasswordLink= driver.findElement(By.partialLinkText("Forgot"));
        //  4.Verify attribute value containsExpected: “/forgot-password.html”
       String actualHrefValue= forgotPasswordLink.getAttribute("href");//hrefin esit oldugu linki alir yani atttributeunu.
       String expectedHrefValue= "/forgot-password.html";
       System.out.println("actualHrefValue= "+actualHrefValue);

       if(actualHrefValue.contains(expectedHrefValue)){
           System.out.println("Href value verification PASSED!");
       }else{
           System.out.println("Href value verification FAILED!");
       }
        System.out.println("Is forgot password displayed? "+forgotPasswordLink.isDisplayed());
        System.out.println(driver.findElement(By.className("offset3")).isDisplayed());

    }
}
