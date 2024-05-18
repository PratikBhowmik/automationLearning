package qkarttests.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
    static WebDriver driver;
    @FindBy(id = "username")
    static WebElement userName;
    @FindBy(id = "password")
    static WebElement passWord;
    @FindBy(xpath = "//button[text() = 'Login to QKart']")
    static WebElement loginButton;
    public Loginpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public static void login(String username, String password) {
        userName.sendKeys(username);
        passWord.sendKeys(password);
        loginButton.click();
    }
}
