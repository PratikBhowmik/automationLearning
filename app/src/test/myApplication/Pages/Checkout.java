import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {

    WebDriver driver;

    @FindBy(xpath = "//input[@name = \"firstName\"]")
    WebElement firstName;

    @FindBy(xpath = "//input[@name = \"lastName\"]")
    WebElement lastName;

    @FindBy(id = "regPhoneInput")
    WebElement phone;

    @FindBy(xpath = "//input[@placeholder = 'Enter address']")
    WebElement addressel;

    @FindBy(xpath = "//input[@placeholder = 'Enter zip code']")
    WebElement pincode;

    @FindBy(xpath = "//button[text() = 'Continue']")
    WebElement continuebutton;

    public Checkout(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void fillDetails(String firstname, String lastname, long number, String address, String zipcode) {
        firstName.sendKeys(firstname);
        lastName.sendKeys(lastname);
        phone.sendKeys(number);
        addressel.sendKeys(address);
        continuebutton.click();
    }
    
}
