package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSingleton {
    WebDriver driver;
    private static DriverSingleton instance = null;

    private DriverSingleton() {

        WebDriverManager.edgedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static DriverSingleton getInstance() {
        if (instance == null) {
            instance = new DriverSingleton();
        }
        return instance;
    }

    public WebDriver getDriver() {
        return driver;
    }
}