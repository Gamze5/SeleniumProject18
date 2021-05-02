package test.day3_ccsSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.EmptyStackException;

public class ExampleForWebDriverFactory {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.clinicalresearch.io");

        WebElement signin = driver.findElement(By.xpath("//*[@id=\"menu-right-menu-1\"]/li[1]/a"));

    }
}
