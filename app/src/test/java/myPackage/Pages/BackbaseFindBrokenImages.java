package myPackage.Pages;

import java.net.HttpURLConnection;
import java.util.*;
import java.net.URL;

import org.bouncycastle.oer.its.etsi102941.Url;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackbaseFindBrokenImages {

    public static int countOfbrokenimages(String url) {

        int count = 0;
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        // Store the total images in the app
        List<WebElement> li = driver.findElements(By.tagName("img"));

        // Iterate through all the images and count how many broken images are there
        for (WebElement img : li) {

            try {
                String imgurl = img.getAttribute("src");
                HttpURLConnection connection = (HttpURLConnection) (new URL(imgurl).openConnection());
                connection.setRequestMethod("HEAD");
                connection.connect();
                int responseCode = connection.getResponseCode();
                if (responseCode >= 400) {
                    count++;
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Exception occured");
            }

        }

        // Return the count
        System.out.println(count);
        driver.quit();
        return count;
    }
}
