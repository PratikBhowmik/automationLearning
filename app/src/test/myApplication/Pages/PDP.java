import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PDP {

    WebDriver driver;

    @FindBy(xpath = "//select")
    WebElement quantityDropdown;

    @FindBy(xpath = "//button[text() = 'Add to Cart']")
    WebElement addToCart;

    @FindBy(xpath = "//span[@class = 'jsx-1508469962 product_count']")
    WebElement cartCount;

    String pdpURL = "https://trulyfreehome.dev/skin-balance-kit";

    public PDP(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Boolean checkPDPdisplayedOrNot() {
        if (driver.getCurrentUrl().equals(pdpURL)) {
            return true;
        } else {
            return false;
        }
    }

    public void changeQuantity(String number) {
        Select sl = new Select(quantityDropdown);
        sl.selectByVisibleText(number);
        addToCart.click();
    }

    public Boolean verifyQuantityUpdatedInCartIcon() {
        String countInStringForm = cartCount.getText();
        int countInIntegerForm = Integer.parseInt(count);
    }
    
}
