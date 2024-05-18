package qkarttests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSingleton {
    static WebDriver driver;
    private static DriverSingleton instance = null;
    private DriverSingleton() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    public static DriverSingleton getInstance() {
        if (instance == null) {
            instance = new DriverSingleton();
        }
        return instance;
    }
    public static WebDriver getDriver() {
        return driver;
    }
}