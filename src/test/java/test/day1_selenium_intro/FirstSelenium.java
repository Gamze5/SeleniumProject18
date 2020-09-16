package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {
    public static void main(String[] args)throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();// bu windowsu maximize eder.pencereyi genisletir.

        driver.get("https://www.google.com");

        System.out.println("driver.gettitle "+driver.getTitle());// nerde oldugunu gosterir hangi sayfada.string olarak alir.parameter almaz.
        System.out.println("driver.getcurrenturl"+ driver.getCurrentUrl());

        //BROWSER NAVIGATION
        Thread.sleep(2000);// it equals to 2 second.
        driver.navigate().back();// this line will take user to the previous page

        Thread.sleep(2000);
        driver.navigate().forward();// this line will go to the next page

        Thread.sleep(2000);
        driver.navigate().refresh();// this line will refresh the page.

        driver.navigate().to("https://www.facebook.com");
        System.out.println(driver.getTitle());// nerde oldugunu gosterir hangi sayfada.string olarak alir.parameter almaz.
        System.out.println( driver.getCurrentUrl()); // bu da ustekiyle ayni.urli gosterir.return type string parameter yok.
        System.out.println(driver.getPageSource());

        driver.manage().window().maximize();// bu windowsu maximize eder.pencereyi genisletir.fullscreen.
        driver.manage().window().fullscreen();// bu da ustekiyle ayni

        driver.close();//will close the current browser tab.
        driver.quit();//will close all tabs and ends the session
        //pkill -9 Google Chrome ==>closes all chrome pages at once bu terminalde kullaniliyor sanirim search it!!









    }
}
