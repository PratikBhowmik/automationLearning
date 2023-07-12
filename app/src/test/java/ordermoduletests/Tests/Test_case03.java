package ordermoduletests.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import ordermoduletests.DriverSingleton;
import ordermoduletests.Pages.Onlineorder;
import ordermoduletests.Pages.Website;

public class Test_case03 {
    WebDriver driver_var;

    @BeforeSuite
    public void setup() {
        DriverSingleton ds_obj = DriverSingleton.getInstance();
        driver_var = ds_obj.getDriver();
    }

    @Test
    public void onlineorder_test() throws InterruptedException {
        Onlineorder online_var = new Onlineorder(driver_var);
        online_var.launch_website();
        online_var.select_catalogue();
        online_var.click_buynow();
        online_var.login_with_phonenumber();
        online_var.fillup_details();
        online_var.click_save_and_continue();
        online_var.select_online_payment_method();
        online_var.click_place_order();
        online_var.otp_screen();
        online_var.select_radio_button_for_netbanking();
        online_var.click_place_order();
        online_var.easebuzz_payment();
    }

    @AfterSuite
    public void teardown() {
        try {
            Thread.sleep(9000);
            driver_var.close();
        } catch (Exception e) {
            System.out.println("Exception while closing browser "+e.getMessage());
        }
    }
}
