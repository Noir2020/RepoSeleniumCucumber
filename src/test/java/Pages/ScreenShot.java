package Pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenShot {

    @Test
    public void takingScreenShot() {

       System.setProperty("webdriver.chrome.driver", "DriverExecFiles/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        // screenshot code.
        TakesScreenshot ts = (TakesScreenshot)driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File("./Screenshots/fbLanding.png");
        try {
            FileUtils.copyFile(src, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }



    }



}