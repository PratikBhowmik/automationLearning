import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signuppage {
    WebDriver driver;
    String actualurl = "https://trulyfreehome.dev/";

    @FindBy(id = "regPhoneInput")
    WebElement phoneField;
    @FindBy(xpath = "//span[text() = 'CONTINUE']")
    WebElement continueButton;
    @FindBy(xpath = "//input[@class = 'jsx-2520378272']")
    WebElement checkbox;
    @FindBy(xpath = "//input[@aria-label = 'Please enter verification code. Digit 1']")
    WebElement otpfield1;
    @FindBy(xpath = "//input[@aria-label = 'Digit 2']")
    WebElement otpfield2;
    @FindBy(xpath = "//input[@aria-label = 'Digit 3']")
    WebElement otpfield3;
    @FindBy(xpath = "//input[@aria-label = 'Digit 4']")
    WebElement otpfield4;

    public Signuppage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void signup(String url, String phone) {
        driver.get(url);
        phoneField.sendKeys(phone);
        checkbox.click();
        continueButton.click();
        otpfield1.sendKeys("1");
        otpfield2.sendKeys("1");
        otpfield3.sendKeys("1");
        otpfield4.sendKeys("1");
    }
}

