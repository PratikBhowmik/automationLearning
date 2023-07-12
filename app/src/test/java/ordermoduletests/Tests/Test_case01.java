package ordermoduletests.Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ordermoduletests.DriverSingleton;
import ordermoduletests.Pages.Loginpage;
import ordermoduletests.Pages.Sellerdash;

public class Test_case01 {

    WebDriver driver_var;

    @BeforeSuite
    public void setup() {

        DriverSingleton ds_obj = DriverSingleton.getInstance();
        driver_var = ds_obj.getDriver();
    }

    @Test
    public void test_case01() throws InterruptedException {
        Sellerdash sellerdash_obj = new Sellerdash(driver_var);
        Loginpage loginpage_obj = new Loginpage(driver_var);
        sellerdash_obj.navigatetosellerdash();
        Thread.sleep(3000);
        loginpage_obj.enter_phonenumber("9436582726");
        loginpage_obj.click_sendotp();
        Thread.sleep(3000);
        loginpage_obj.enter_otp("0000");
        loginpage_obj.click_verifyotp();
    }

    @AfterSuite
    public void teardown() {
        driver_var.close();
    }

}
