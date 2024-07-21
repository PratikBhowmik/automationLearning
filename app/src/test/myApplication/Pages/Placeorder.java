import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Placeorder {

    WebDriver driver;

    @FindBy(xpath = "//button[text() = '+Add a new card']")
    WebElement addCard;

    @FindBy(id = "full_name")
    WebElement fullName;

    @FindBy(id = "card_number")
    WebElement cardNumber;

    @FindBy(id = "cvv")
    WebElement cvv;

    @FindBy(id = "month")
    WebElement month;
    
    @FindBy(id = "year")
    WebElement year;

    @FindBy(id = "submitbutton")
    WebElement addcard;

    @FindBy(id = "confirm_btn")
    WebElement confirmBtn;

    public Placeorder(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillCardDetails(String fullname, String cardnumber, String CVV, String MONTH, String YEAR) {
        addCard.click();
        fullName.sendKeys(fullname);
        cardNumber.sendKeys(cardnumber);
        cvv.sendKeys(CVV);
        month.sendKeys(MONTH);
        year.sendKeys(YEAR);
        addcard.click();
        confirmBtn.click();
    }
}