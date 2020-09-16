package test.WARM_UP_TASKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.List;

public class TASK_TOTAL_LINKS_APPLE {
    @Test
    public void appleverification(){
        //TC #02: FINDELEMENTS_APPLE
        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // 2.Go to https://www.apple.com
        driver.get("https://www.apple.com");
        driver.manage().window().maximize();
        // .Click to iPhone
        WebElement phoneLink=driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']"));
        phoneLink.click();
        // 4.Print out the texts of all links
        List<WebElement> aLlLinks=driver.findElements(By.xpath("//body//a"));


        // 5.Print out how many link is missing text
        // 6.Print out how many link has text
        // 7.Print out how many total link
        int linkWithoutText =0;
        int linkwithText=0;
        for(WebElement Link :aLlLinks){
            String eachtextlink=Link.getText();
            System.out.println(eachtextlink);
            if(eachtextlink.isEmpty()){
                linkWithoutText++;
            }else{
                linkwithText++;
            }
        }
        System.out.println("All links missing tesxt "+linkWithoutText);
        System.out.println("All links with text "+linkwithText);
        System.out.println("All links in TOTAL "+aLlLinks.size());
      driver.close();
    }
}
