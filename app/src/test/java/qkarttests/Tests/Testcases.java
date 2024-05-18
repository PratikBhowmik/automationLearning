package qkarttests.Tests;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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

import io.github.bonigarcia.wdm.WebDriverManager;
import qkarttests.DriverSingleton;
import qkarttests.Pages.Loginpage;
import qkarttests.Pages.Register;

public class Testcases {

    WebDriver driver;

    @BeforeSuite
    public void setup() {
        DriverSingleton.getDriver();
    }

    @Test
    public void test_case01() throws InterruptedException {

        Loginpage.login("Pratik", "Bhowmik");
    }

    @Test
    public void test_case02() {
        Register.registration(null, null, null, false);
        Register.register();
    }

    @AfterSuite
    public void teardown() {
        driver.close();
    }
}
