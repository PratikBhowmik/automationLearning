package ordermoduletests.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
    WebDriver driver;

    @FindBy(xpath = "//div[@class = 'Input_input-group__c6y0f undefined rs-input-group']/input")
    WebElement input_phonenumber;

    @FindBy(xpath = "//button[text() = 'Generate OTP']")
    WebElement otp_button;

    @FindBy(xpath = "//div[@class = 'Input_input-group__c6y0f undefined rs-input-group']/input")
    WebElement input_otp;

    @FindBy(xpath = "//button[text() = 'Verify OTP']")
    WebElement verify_otpbutton;

    public Loginpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enter_phonenumber(String phonenumber) {
        input_phonenumber.sendKeys(phonenumber);
    }

    public void enter_otp(String otp) {
        input_otp.sendKeys(otp);
    }

    public void click_sendotp() {
        otp_button.click();
    }

    public void click_verifyotp() {
        verify_otpbutton.click();
    }

}
