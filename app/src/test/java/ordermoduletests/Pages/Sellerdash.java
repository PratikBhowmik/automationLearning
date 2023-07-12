package ordermoduletests.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sellerdash {

    WebDriver driver;

    @FindBy(xpath = "//div[@class='SideNav_sidenav-item-container__PAVyt']")
    WebElement order_element;

    Actions act_obj;

    String url = "http://v2.nushop-dashboard.kaip.in";

    public Sellerdash(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigatetosellerdash() {
        driver.get(this.url);
    }

    public void hoverto_order() {
        act_obj = new Actions(driver);
        act_obj.moveToElement(order_element);
    }

    public void clickprocessorder() {
        act_obj = new Actions(driver);
        act_obj.moveToElement(order_element);
    }
}
