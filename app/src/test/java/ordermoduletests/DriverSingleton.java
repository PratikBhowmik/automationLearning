package ordermoduletests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSingleton {

    private WebDriver driver;

    private static DriverSingleton instanceofDriverSingletonClass = null;

    private DriverSingleton() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static DriverSingleton getInstance() {
        if (instanceofDriverSingletonClass == null) {
            instanceofDriverSingletonClass = new DriverSingleton();
        }
        return instanceofDriverSingletonClass;
    }

    public WebDriver getDriver() {
        return driver;
    }

}
