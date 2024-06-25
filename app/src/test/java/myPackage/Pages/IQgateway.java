package myPackage.Pages;

import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IQgateway {
    WebDriver driver;

    public static void function() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String mainwindow = driver.getWindowHandle();
        Set<String> li = driver.getWindowHandles();

        for (String string : li) {
            
        }
        
    }
    
}
