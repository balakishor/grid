package org.selenium.grid;

import com.epam.reportportal.testng.ReportPortalTestNGListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.net.URL;

@Listeners({ReportPortalTestNGListener.class})
public class GoogleTest {
    @Test
    public void openGoogle() throws Exception {
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), new ChromeOptions());
        driver.get("https://www.google.com");
        System.out.println("Google Title: " + driver.getTitle());
        driver.quit();
    }
}
