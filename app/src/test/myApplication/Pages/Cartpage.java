import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage {
    WebDriver driver;

    @FindBy(xpath = "//li[@title = 'Cart']")
    WebElement cartel;

    @FindBy(xpath = "(//a[text() = 'Proceed to Checkout'])[1]")
    WebElement proceedCheckout;

    @FindBy(xpath = "//span[@class = 'total_price']")
    WebElement totalprice;

    public Cartpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnCart() {
        cartel.click();
    }

    // public Boolean isProductDisplayed() {

    // }

    // public Boolean isProductDetailsCorrect() {

    // }

    public Boolean verifyPrice(int PRICE) {
        if (totalprice.getText().contains(PRICE)) {
            return true;
        }
        return false;
    }

    public void clickCheckout() {
        proceedCheckout.click();
    }
    
}
