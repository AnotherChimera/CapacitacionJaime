package pe.interbank;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {

    public  String baseUrl = "https://www.google.com/";
    public  WebDriver driver;

    @BeforeTest
    public  void setBaseUrl() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir").concat("/src/test/resources/chromedriver.exe"));
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @Test
    public void googleSearch() {
        WebElement googleSearch = driver.findElement(By.name("q"));
        //write textboxt
        googleSearch.sendKeys("Interbank" + Keys.ENTER);
        //find button
        //WebElement searchButton = driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']"));
      // WebElement searchButton = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
        //click button
       // searchButton.click();
    }

    @AfterTest
    public void endSession() {
        //driver.quit();
    }
}