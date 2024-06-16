package qkarttests.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import qkarttests.Pages.HomePage;

//End to End to validate URL

public class TestCase01 {
    WebDriver driver;
    SoftAssert softassert;
    @BeforeSuite
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void urlTest() {
        HomePage home = new HomePage(driver);
        home.navigateToHome();
        softassert.assertEquals(home.homePageUrl(), "https://the-internet.herokuapp.com/");
    }
}
