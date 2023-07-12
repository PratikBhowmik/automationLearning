package ordermoduletests.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import ordermoduletests.DriverSingleton;
import ordermoduletests.Pages.Website;

public class Test_case02 {
    WebDriver driver_var;

    @BeforeSuite
    public void setup() {

        DriverSingleton ds_obj = DriverSingleton.getInstance();
        driver_var = ds_obj.getDriver();
    }

    @Test
    public void codorder_test() throws InterruptedException {
        Website websitepage_obj = new Website(driver_var);
        websitepage_obj.multiple_cod_orders();
    }

    @AfterSuite
    public void teardown() {
        driver_var.close();
    }
}
