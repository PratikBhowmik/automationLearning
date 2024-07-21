import org.openqa.selenium.WebDriver;
import com.google.common.annotations.VisibleForTesting;

public class TestCase1 {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        DriverSingleton ds = DriverSingleton.getInstance();
        driver = ds.getDriver();

    }
    
    @Test
    public void validateProductCountUpdate() {
        Signuppage signup = new Signuppage(driver);
        signup.signup("https://trulyfreehome.dev", "3032222555");
        
    }

}

