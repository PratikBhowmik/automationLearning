package qkarttests.Tests;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bookanartist {
    public static void main(String[] args) throws InterruptedException {

        //This is the script for posting a job with user logged in
        //Please create a dummy account with dummy credentials to see the script running also email should be verified
        //Also the captcha automation is not recommended so please solve the captcha manually to see the script running
        //I have also included validations
        //Script will stop in b/w you have to enter solved in the console to continue the script
        //All the steps are written below


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        driver.manage().window().maximize();
        driver.get("https://hireanartist.com.au/post-a-job");
        Thread.sleep(3000);
        // driver.findElement(By.cssSelector(".ant-btn.css-6rzz9k.ant-btn-default.custom-btn.custom-btn__regular.btn__outline-secondary")).click();
        // driver.findElement(By.id("email")).sendKeys("impratikbhowmik@gmail.com");
        // driver.findElement(By.id("password")).sendKeys("abc@97");
        

        // This code is for captcha but 
        // it's not recommended to do automation for captcha, 
        // captcha is designed to prevent automation 
        // please solve the captcha manually 
        // to see the rest of the script running in action please input SOLVED on your terminal to see the script running
        // Thread.sleep(6000);
        // driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
        // Thread.sleep(6000);
        // driver.findElement(By.cssSelector(".recaptcha-checkbox-border")).click();
        // driver.switchTo().defaultContent();
        // Thread.sleep(6000);


        // System.out.println("Please enter SOLVED once captcha is solved manually");
        // Scanner scan = new Scanner(System.in);
        // scan.nextLine();

        // driver.findElement(By.xpath("//span[text()='Log in']")).click();

        // Thread.sleep(6000);

        // List<WebElement> similiarele = driver.findElements(By.cssSelector(".ant-btn.css-6rzz9k.ant-btn-default.custom-btn.custom-btn__regular.btn__solid-tertiary"));

        // similiarele.get(0).click();

        driver.findElement(By.id("project_name")).sendKeys("Public Window Mural - Canada");
        driver.findElement(By.xpath("//span[text()='Mural/Graffiti']")).click();

        Thread.sleep(6000);
        List<WebElement> checkBoxes = driver.findElements(By.cssSelector(".ant-checkbox-input"));
        checkBoxes.get(0).click();

        driver.findElement(By.id("width")).sendKeys("5");
        driver.findElement(By.id("height")).sendKeys("5");
        driver.findElement(By.xpath(
                "//label[@class = 'ant-radio-button-wrapper ant-radio-button-wrapper-checked ant-radio-button-wrapper-in-form-item pj-measure-category css-6rzz9k']"))
                .click();

        driver.findElement(By.xpath("//input[@placeholder='Search your location...']")).sendKeys("Agartala");
        Thread.sleep(3000);
        List<WebElement> li = driver.findElements(By.xpath("//div[@class = 'suggestion-item']"));
        for (WebElement ele : li) {
            if (ele.getText().contains("Agartala")) {
                ele.click();
                break;
            }
        }

        driver.findElement(By.xpath("//span[text()='Residential']")).click();
        driver.findElement(By.xpath("//span[text() = 'Continue']")).click();


        driver.findElement(By.xpath("//input[@value='No idea']")).click();
        driver.findElement(By.id("job_description")).sendKeys("We are seeking an experienced mural artist to create\n" + //
                        "a captivating mural for a public window space measuring 5ft x 5ft in Canada.");
        driver.findElement(By.xpath("//span[text()='Portrait']")).click();
        driver.findElement(By.cssSelector(".ant-btn.css-6rzz9k.ant-btn-primary.custom-btn.custom-btn__long.btn__solid-primary")).click();


        driver.findElement(By.id("budget")).sendKeys("1000");
        driver.findElement(By.id("currency")).sendKeys("INR");
        Thread.sleep(6000);
        List<WebElement> list = driver.findElements(By.xpath("//div[@aria-selected]"));
        for (WebElement webElement : list) {
            if (webElement.getText().contains("INR")) {
                webElement.click();
                break;
            }
        }

        driver.findElement(By.cssSelector(".ant-btn.css-6rzz9k.ant-btn-default.custom-btn.project-date-custom-btn")).click();
        driver.findElement(By.cssSelector(".ant-btn.css-6rzz9k.ant-btn-primary.custom-btn.custom-btn__long.btn__solid-primary")).click();

        //Budget details
        Thread.sleep(6000);
        List<WebElement> elements = driver.findElements(By.cssSelector(".ant-radio-button-wrapper.ant-radio-button-wrapper-in-form-item.css-6rzz9k"));
        elements.get(1).click();

        driver.findElement(By.cssSelector(".PhoneInputInput")).sendKeys("8939117490");

        driver.findElement(By.id("first_name")).sendKeys("Pratik");
        driver.findElement(By.id("last_name")).sendKeys("Bhowmik");
        driver.findElement(By.id("email")).sendKeys("pratik.bhowmik@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Patrick@97");
        driver.findElement(By.id("terms_privacy")).click();

        Thread.sleep(6000);

        System.out.println("Please solve the captcha manually and type solved here");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        driver.findElement(By.xpath("//span[text()='Save & submit']")).click();

        Thread.sleep(6000);

        //Validation of thank you message after job is created  
        Assert.assertTrue(driver.findElement(By.id("poj-success-popup-gtm")).isDisplayed());
        driver.quit();
    }
}
