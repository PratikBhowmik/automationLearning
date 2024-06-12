package qkarttests.Tests;

import java.util.*;
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
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import qkarttests.Pages.Loginpage;
import qkarttests.Pages.Register;
import qkarttests.resources.DriverSingleton;
import qkarttests.resources.ExtentReportManager;

public class Registration {
    WebDriver driver;
    ExtentTest test;
    SoftAssert assertvar;
    String url = "https://crio-qkart-frontend-qa.vercel.app/register";

    @BeforeSuite
    public void setup() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        test =  ExtentReportManager.getInstance().createTest("My test case");
    }

    @BeforeTest
    @BeforeClass
    @BeforeMethod

    //Validation of user successful registration
    @Test
    public void test_case01() {
        Register reg = new Register(driver);
        assertvar.assertTrue(reg.registration("ABC", "DEF", "IJK", true));
        test.log(Status.PASS, "Registered successfully");
    }

    @Test
    public void test_case02() {
        
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
        ExtentReportManager.getInstance().flush();
    }
}
