package myPackage.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;
    String homePageUrl = "https://the-internet.herokuapp.com/";

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToHome() {
        driver.get(homePageUrl);
    }

    public String homePageUrl() {
        return driver.getCurrentUrl();
    }
}
