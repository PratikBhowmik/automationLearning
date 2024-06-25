package myPackage.Pages;
import java.sql.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Register {
    WebDriver driver;
    String url = "https://crio-qkart-frontend-qa.vercel.app/register";
    String finalUrl = "https://crio-qkart-frontend-qa.vercel.app/";


    @FindBy(id = "username")
    WebElement emailfield;
    @FindBy(id = "password")
    WebElement passwordField;
    @FindBy(id = "confirmPassword")
    WebElement confirmpassword;
    @FindBy(xpath = "//button[text()='Register Now']")
    WebElement registernowButton;
    

    public Register(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Boolean registration(String username, String password, String confirmPass, Boolean dynamicUser) {
        if (dynamicUser) {
        }
        driver.get(url);
        emailfield.sendKeys(username);
        passwordField.sendKeys(password);
        confirmpassword.sendKeys(confirmPass);
        registernowButton.click();
        if (driver.getCurrentUrl().equals(finalUrl)) return true;
        return false;
    }
}
