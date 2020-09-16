package test.day3_ccsSelector_xpath;

import org.openqa.selenium.WebDriver;
import utilities.WebDriverFactory;

import java.util.EmptyStackException;

public class ExampleForWebDriverFactory {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com");

    }
}
