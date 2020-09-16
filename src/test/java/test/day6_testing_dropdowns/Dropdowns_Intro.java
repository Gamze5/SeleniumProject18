package test.day6_testing_dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Dropdowns_Intro {
    WebDriver driver;// burda yaratiyoruz ki diger methodlarda da kullanabilelim.obur turlu local variable olurdu.

    @BeforeMethod
    public void setUp() {
        // TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
        //1.Open Chrome browser
        //2.Go to http://practice.cybertekschool.com/dropdown
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }


    @Test
    public void tes1_default_value_verification() {

        // 3.Verify “Simple dropdown” default selected value is correctExpected: “Please select an option”
        Select simpleDropDown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        String actualDefaultOfSimpleDropdown = simpleDropDown.getFirstSelectedOption().getText();//variable icine koyduk secme isini
        String expectedDefaultOfSimpleDropdown = "Please select an option";
        Assert.assertEquals(actualDefaultOfSimpleDropdown, expectedDefaultOfSimpleDropdown);


        // 4.Verify“State selection” default selected value is correctExpected: “Select a State”
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));//LOCate yaptik
        String actualDefaultOfStateDropdown = stateDropdown.getFirstSelectedOption().getText();//get text kullanmazsak webelemnti stringe assign etmis oluruzz o da error verir.
        String expectDefaultOfStateDropdown = "Select a State";

        Assert.assertEquals(actualDefaultOfStateDropdown, expectDefaultOfStateDropdown);
    }


    @Test
    public void test2_state_dropdown_verification()throws InterruptedException {
        // TC #2: Selecting state from State dropdown and verifyingresult
        // 1.Open Chrome browser
        // 2.Go to http://practice.cybertekschool.com/dropdown
        //FIRST 2 STEPS ARE IMPLEMENTED IN BEFOREMETHOD

        // 3.Select Illinois
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));//first located yerini bulduj
        Thread.sleep(1000);
        stateDropdown.selectByValue("IL");//burda value methodla secme ozelligini kullandk ve sectik.

        // 4.Select Virginia
        Thread.sleep(1000);
        stateDropdown.selectByVisibleText("Virginia");// virgina kategorisini sectik suan.bu diger bi yolu


        // 5.Select California
        Thread.sleep(1000);
        stateDropdown.deselectByIndex(5);// bu da secmenin farkli yolu index nosunu alirsin saymaya sifirdan basla top to bottom
        //toplam uc farkli method yaptik selectByValue("IL"), selectByVisibleText("Virginia"),deselectByIndex(5);

        // 6.Verify final selected option is California.Use all Select options.(visible text, value, index
        String expectedOption="California";
        String actualSelectedOption =stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualSelectedOption,expectedOption);//burda da verification yaptik
        Assert.assertTrue(actualSelectedOption.equals(expectedOption));//bu da verification yapmanin farkli bi yolu


    }
}