import org.openqa.selenium.WebDriver;

public class DriverSingleton {

    private static Singleton instance;
    
    private DriverSingleton () {

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

