import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    @FindBy(xpath = "//div[normalize-space()='Brands']")
    WebElement brandsEl;
    @FindBy(xpath = "//div[@class = 'jsx-2446998146 col-2 py-3   brand_logo'][12]")
    WebElement emami;

    

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void hoverAndClickEmami() {
        Actions act = new Actions(driver);
        act.moveToElement(brandsEl).perform();
        emami.click();

    }


}
