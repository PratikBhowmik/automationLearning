package qkarttests.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
    WebDriver driver;
    @FindBy(id = "username")
    WebElement userName;
    @FindBy(id = "password")
    WebElement passWord;
    @FindBy(xpath = "//button[text() = 'Login to QKart']")
    WebElement loginButton;
    public Loginpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void login(String username, String password) {
        userName.sendKeys(username);
        passWord.sendKeys(password);
        loginButton.click();
    }
}
