package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRIO {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();// bu windowsu maximize eder.pencereyi genisletir.

        driver.get("https://www.clinicalresearch.io");

        driver.findElement(By.xpath("//*[@id=\"menu-right-menu-1\"]/li[1]/a")).click();

        Thread.sleep(2000);
        WebElement  email =driver.findElement(By.xpath("//*[@id=\"firebaseui-auth-container\"]/div/form/div[2]/div/div[1]/input"));
        email.sendKeys("belkebarisbb@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"firebaseui-auth-container\"]/div/form/div[3]/div/button")).click();
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("//*[@id=\"firebaseui-auth-container\"]/div/form/div[2]/div[3]/input"));
        password.sendKeys("47Bb47bb??");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"firebaseui-auth-container\"]/div/form/div[3]/div[2]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='help-center-button']")).click();
        Thread.sleep(1000);
        JavascriptExecutor CS = (JavascriptExecutor) driver;
        CS.executeScript("window.scrollBy(0,800)");
        driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[2]/div/article/ul/li[4]")).click();







    }
}
