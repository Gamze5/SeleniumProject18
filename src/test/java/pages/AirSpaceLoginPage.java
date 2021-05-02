package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AirSpaceLoginPage {
    public AirSpaceLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="username")
    public WebElement usernameBox;

    @FindBy(id="password")
    public WebElement passwordBox;

    @FindBy(xpath="//button[@class='radius']")
    public WebElement loginButton;

}
