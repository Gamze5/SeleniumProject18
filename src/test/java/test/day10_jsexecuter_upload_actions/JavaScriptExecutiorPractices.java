package test.day10_jsexecuter_upload_actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;

public class JavaScriptExecutiorPractices {
    @Test
    public void jsexecutor_test() throws InterruptedException {
    Driver.getDriver().get("http://practice.cybertekschool.com/");
        WebElement cybertekSchoolLink = Driver.getDriver().findElement(By.linkText("Cybertek School"));
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)Driver.getDriver();
        Thread.sleep(4000);

        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", cybertekSchoolLink);
    }
}
