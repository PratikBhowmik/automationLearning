package qkarttests.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BackbaseDropdown {

    public static void dropdownHandling(String url) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        
        WebElement dropd = driver.findElement(By.id("globalfooter-select_language"));

        Select sl = new Select(dropd);
        sl.selectByValue("en_US");

        driver.quit();


    }
    
}
