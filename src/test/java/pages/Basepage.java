package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basepage {

   static WebDriver driver;
   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

   static {
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      driver.manage().window().maximize();
   }

   public Basepage(WebDriver driver) {

      Basepage.driver = driver;
   }

   public void closeNavigate() {

      driver.quit();

   }

   public static void navigateTo(String url) {

      driver.get(url);

   }

   protected WebElement Find(String locator) {
      return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
  }
   public void clickElement(String locator) {

      Find(locator).click();

   }

   public void findElements(){

      wait.until(ExpectedConditions.urlContains("/contactenos/"));

   }
   

   public void Write(String locator, String keystosend) {

      Find(locator).clear();
      Find(locator).sendKeys(keystosend);

   }

   public void dropDownByValue(String locator, String value) {

      Select dropdown = new Select(Find(locator));

      dropdown.selectByValue(value);

   }

   public void dropDownByIndex(String locator, Integer index) {

      Select dropdown = new Select(Find(locator));

      dropdown.selectByIndex(index);

   }


   public int dropdownSize(String locator) {
      Select dropdown = new Select(Find(locator));

      List<WebElement> dropdownOptions = dropdown.getOptions();

      return dropdownOptions.size();

   }

     public static void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
    }

}
