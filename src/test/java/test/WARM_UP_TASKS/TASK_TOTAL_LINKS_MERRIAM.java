package test.WARM_UP_TASKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.List;

public class TASK_TOTAL_LINKS_MERRIAM {
    @Test
    public void findToTalLinks() {
        //TC #0: FINDELEMENTS
        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // 2.Go to https://www.merriam-webster.com/
        driver.get("https://www.merriam-webster.com/");
        driver.manage().window().maximize();
        // 3.Print out the texts of all links
        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
        int missingText=0;
        int hasText=0;
        for (WebElement each : allLinks) {
            String textOfEachLink = each.getText();
            System.out.println(textOfEachLink);

            // 4.Print out how many link is missing text
            if(textOfEachLink.isEmpty()){
                missingText++;
            }else{
                // 5.Print out how many link has text
                hasText++;
            }
        }
        System.out.println("Missing text links are "+missingText);
        System.out.println("Links having text are "+hasText);
        // 6.Print out how many total link
        System.out.println("All links in TOTAL are "+allLinks.size());
      driver.close();


    }

}