package myPackage.Pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
//Select the 4th value from the dropdown

public class BackbaseDropdownCode {

    public static void dropdownHandling(String url) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get(url);
        driver.manage().window().maximize();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        driver.findElement(By.xpath("//button[@data-tracking-control-name='footer-lang-dropdown_trigger']")).click();

        List<WebElement> li = driver.findElements(By.xpath("//li[@role = 'presentation']"));
        li.get(4).click();

        // for (WebElement elem : li) {
        //     System.out.println(elem.getText());
            
        // }

        Thread.sleep(3000);
        driver.quit();

    }
}
