package qkarttests.Tests;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import qkarttests.DriverSingleton;
import qkarttests.Pages.Loginpage;
import qkarttests.Pages.Register;

public class Registration {

    WebDriver driver;

    @BeforeSuite
    public void setup() {
        DriverSingleton ds = DriverSingleton.getInstance();
        
        ds.getDriver();
    }

    @BeforeTest
    @BeforeClass
    @BeforeMethod

    //Validation of user successful registration
    @Test
    public void test_case01() {
        System.out.println("test 1");
    }

    @Test
    public void test_case02() {
        System.out.println("test 2");
    }

    @Test
    public void test_case03() {

    }

    @Test
    public void test_case04() {

    }

    @Test
    public void test_case05() {
        
    }


    @AfterMethod
    @AfterClass
    @AfterTest

    @AfterSuite
    public void teardown() {
        driver.quit();
    }
}
