package org.selenium.grid;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GridTest {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        // Grid Hub URL
        URL gridUrl = new URL("http://localhost:4444/wd/hub");

        // Desired capabilities
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WINDOWS);

        // Create a remote WebDriver instance
        WebDriver driver = new RemoteWebDriver(gridUrl, capabilities);

        // Run your test
        driver.get("https://www.google.com");
        System.out.println("Title: " + driver.getTitle());

        Thread.sleep(3000);

        // Quit driver
        driver.quit();
    }
}
