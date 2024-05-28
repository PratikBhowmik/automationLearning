package automation_shopdeck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BackbaseFindBrokenlinks {
    


    public static int noofBrokenLinks() {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("application url where there are broken images");

        return -1;
    }
}
