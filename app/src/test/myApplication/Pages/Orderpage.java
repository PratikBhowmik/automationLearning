import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Orderpage {
    WebDriver driver;

    @FindBy(xpath = "//div[@class = 'jsx-353953937 orderid']")
    List<WebElement> orderIDs;

    public Orderpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Boolean getOrderID(String ORDERIDINPUT) {
        for (WebElement webElement : orderIDs) {
            if (webElement.equals(ORDERIDINPUT)) {
                return true;
            }
        }
        return false;
    }
}
