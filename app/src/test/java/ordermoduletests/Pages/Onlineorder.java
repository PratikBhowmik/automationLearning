package ordermoduletests.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Onlineorder {

    WebDriver driver_var;
    JavascriptExecutor js_var;
    String url = "http://fifth.nushop.kaip.in";
    WebDriverWait wait;

    public Onlineorder(WebDriver driver_var) {
        this.driver_var = driver_var;
    }

    public void launch_website() {
        try {
            this.driver_var.get(this.url);
        } catch (Exception e) {
            System.out.println("unable to launch website " + e.getMessage());
        }
    }

    public void select_catalogue() {
        try {
            WebElement catalogue_element = driver_var.findElement(By.xpath(
                    "//body//div[@id='root']//div[@id='main']//div//div//div//div[1]//a[1]//div[1]//div[1]//div[2]//img[2]"));
            wait = new WebDriverWait(driver_var, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.elementToBeClickable(catalogue_element));
            catalogue_element.click();
        } catch (Exception e) {
            System.out.println("unable to select catalogue " + e.getMessage());
        }
    }

    public void click_buynow() {
        try {
            Thread.sleep(3000);
            WebElement buynow_button = driver_var.findElement(By.xpath("//div[contains(text(),'Buy Now')]"));
            wait = new WebDriverWait(driver_var, Duration.ofSeconds(7));
            js_var = (JavascriptExecutor) driver_var;
            js_var.executeScript("window.scrollBy(0,600)");
            buynow_button.click();
        } catch (Exception e) {
            System.out.println("unable to click buy now button " + e.getMessage());
        }
    }

    public void login_with_phonenumber() {
        try {
            Thread.sleep(3000);
            WebElement phonenumber_field = driver_var.findElement(By.xpath("//input[@type='tel']"));
            WebElement confirm_number_cta = driver_var
                    .findElement(By.xpath("//div[contains(text(),'Confirm number')]"));
            phonenumber_field.sendKeys("8939117490");
            confirm_number_cta.click();
        } catch (Exception e) {
            System.out.println("unable to login to website using phone number");
        }
    }

    public void fillup_details() {
        try {
            WebElement full_name = driver_var.findElement(By.xpath("//input[@name='name']"));
            WebElement pin_code = driver_var.findElement(By.xpath("//input[@name='zip']"));
            WebElement house_number = driver_var
                    .findElement(By.xpath("//div[@class='css-otqija']//div[3]//div[1]//div[1]//input[1]"));
            WebElement adress_field = driver_var.findElement(By.xpath("//input[@name='address-one']"));
            full_name.sendKeys("Pratik Bhowmik");
            pin_code.sendKeys("799006");
            house_number.sendKeys("10");
            adress_field.sendKeys("long adress too long adress");
        } catch (Exception e) {
            System.out.println("Unable to fill details " + e.getMessage());
        }
    }

    public void click_save_and_continue() {
        try {
            Thread.sleep(3000);
            WebElement save_and_continue_cta = driver_var.findElement(By.xpath("//div[text() = 'Save & Continue']"));
            save_and_continue_cta.click();
        } catch (Exception e) {
            System.out.println("Didn't click on save and contninue");
        }
    }

    public void select_online_payment_method() {
        try {
            Thread.sleep(3000);
            WebElement radio_button = driver_var.findElement(By.xpath("//input[@id='online']"));
            radio_button.click();
        } catch (Exception e) {
            System.out.println("Unable to select online " + e.getMessage());
        }
    }

    public void select_radio_button_for_netbanking() {
        try {
            Thread.sleep(3000);
            WebElement radio_button = driver_var.findElement(By.xpath("//input[@value='2']"));
            radio_button.click();

        } catch (Exception e) {
            System.out.println("Missed selecting radio button " + e.getMessage());
        }
    }

    public void click_place_order() {
        try {
            Thread.sleep(3000);
            WebElement place_order_button = driver_var.findElement(By.xpath("//div[normalize-space()='Place Order']"));
            place_order_button.click();
        } catch (Exception e) {
            System.out.println("Unable to click on place order button " + e.getMessage());
        }
    }

    public void easebuzz_payment() {
        try {
            Thread.sleep(10000);
            WebElement easebuzz_frame = driver_var
                    .findElement(By.xpath("//div[contains(@id,'easebuzz-container')]/iframe"));
            driver_var.switchTo().frame(easebuzz_frame);
            WebElement net_bank = driver_var
                    .findElement(By.xpath("//div[@class = 'card-area']/div[3]/cardsection/div/img"));
            WebElement easebuzz_popup_sbi = driver_var
                    .findElement(By.xpath("(//div[@class = 'ebc-major-bank c-pointer'])[5]"));
            WebElement easebuzz_paynow_button = driver_var
                    .findElement(By.xpath("//div[@class = 'content-section']/button"));
            Thread.sleep(3000);
            net_bank.click();
            Thread.sleep(3000);
            easebuzz_popup_sbi.click();
            Thread.sleep(3000);
            easebuzz_paynow_button.click();
        } catch (Exception e) {
            System.out.println(
                    "Online payment not successful " + e.getMessage());
        }
    }

    public void otp_screen() {
        try {
            Thread.sleep(3000);
            WebElement otpfield_one = driver_var.findElement(By.xpath("(//input[@placeholder='-'])[1]"));
            WebElement otpfield_two = driver_var.findElement(By.xpath("(//input[@placeholder='-'])[2]"));
            WebElement otpfield_three = driver_var.findElement(By.xpath("(//input[@placeholder='-'])[3]"));
            WebElement otpfield_four = driver_var.findElement(By.xpath("(//input[@placeholder='-'])[4]"));
            WebElement confirm_otp = driver_var.findElement(By.xpath("//div[contains(text(),'Confirm OTP')]"));
            otpfield_one.sendKeys("0");
            otpfield_two.sendKeys("0");
            otpfield_three.sendKeys("0");
            otpfield_four.sendKeys("0");
            confirm_otp.click();
        } catch (Exception e) {
            System.out.println("otp error " + e.getMessage());
        }
    }
}
