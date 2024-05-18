package qkarttests.Pages;

import java.sql.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Register {
    WebDriver driver;
    String url = "https://crio-qkart-frontend-qa.vercel.app/register";

    @FindBy(id = "username")
    WebElement emailfield;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(id = "confirmPassword")
    WebElement confirmpassword;
    @FindBy(xpath = "//button[text()='Register Now']")
    WebElement registernowButton;

    public Register(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static void registration(String username, String password, String confirmPass, Boolean dynamicUser) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String test_data_username;
        if (dynamicUser)
            test_data_username = username + String.valueOf(timestamp.getTime());
        else
            test_data_username = username;
    }

    public void register() {
        registernowButton.click();
    }

    public Boolean isregistrationPagedisplayed() {
        return driver.getCurrentUrl().equalsIgnoreCase(url);
    }
}
