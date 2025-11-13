package org.selenium.grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.URL;

public class BingTest {
    @Test
    public void openBing() throws Exception {
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), new FirefoxOptions());
        driver.get("https://www.bing.com");
        System.out.println("Bing Title: " + driver.getTitle());
        driver.quit();
    }
}
