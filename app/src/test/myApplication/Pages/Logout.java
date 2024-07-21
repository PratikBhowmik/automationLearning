import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

    WebDriver driver;

    @FindBy(xpath = "//div[@class = 'jsx-1990881828 profile_box']")
    WebElement profileBox;

    @FindBy(xpath = "//p[text() = 'Logout']")
    WebElement logout;

    public Logout(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void logout() {
        profileBox.click();
        logout.click();
    }
}
